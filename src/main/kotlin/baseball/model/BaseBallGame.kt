package baseball.model

import baseball.config.GAME_EXIT
import baseball.config.ResultRule
import baseball.extension.isAllStrike
import baseball.extension.isNothing
import baseball.model.player.Computer
import baseball.model.player.User
import baseball.util.NumberGenerator
import baseball.view.InputView
import baseball.view.OutputView

class BaseBallGame(
    private val inputView: InputView,
    private val outputView: OutputView,
    private val user: User = User(),
) {
    fun run() {
        var state = true
        while (state) {
            outputView.printStartGame()
            val computer = createComputer()
            val referee = Referee()

            start(computer, referee)
            state = restart()
        }
    }

    private fun createComputer(): Computer {
        val numbers = NumberGenerator.generateNumber()
        return Computer.create(numbers)
    }

    private fun start(computer: Computer, referee: Referee) {
        while (true) {
            selectNumber()
            compareNumbers(computer, referee)
            runPrintResult(referee)
            if (referee.getEachCount().isAllStrike()) break
        }
    }

    private fun selectNumber(){
        user.changeNumbers(inputView.readNumbers())
    }

    private fun compareNumbers(computer: Computer, referee: Referee) {
       referee.saveResult(user.numbers, computer.numbers)
    }

    private fun runPrintResult(referee: Referee) {
        val result = referee.getEachCount()
        if (result.isAllStrike()) {
            outputView.printAllStrike()
        } else if (result.isNothing()) {
            outputView.printNothing()
        } else {
            outputView.printNormalResult(result)
        }
    }

    private fun restart(): Boolean {
        val state = inputView.readRestart()
        return state != GAME_EXIT
    }
}