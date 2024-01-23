package baseball.model

import baseball.model.player.Computer
import baseball.model.player.User
import baseball.util.NumberGenerator
import baseball.view.InputView
import baseball.view.OutputView

class BaseBallGame(
    private val inputView: InputView,
    private val outputView: OutputView
) {
    fun start() {
        outputView.printStartGame()
        val computer = createComputer()
        val user = createUser()
    }

    private fun createUser(): User{
        val user = User()
        user.changeNumbers(inputView.readNumbers())
        return user
    }

    private fun createComputer(): Computer {
        val numbers = NumberGenerator.generateNumber()
        return Computer.create(numbers)
    }
}