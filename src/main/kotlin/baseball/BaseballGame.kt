package baseball

import baseball.Constants.RandomNumConstants
import baseball.Constants.StatementConstant
import baseball.Service.Computer
import baseball.View.InputView
import baseball.View.OutputView

class BaseballGame {

    private val inputView = InputView()
    private val outputView = OutputView()
    private val computer = Computer()

    fun play() {
        do {
            game()
        } while (inputView.restartGame() == StatementConstant.RESUME)
    }

    private fun game() {
        outputView.printStartGame()

        val answerNum = computer.createNum()

        while (true) {
            val userNum = inputView.userInput()
            val (strike, ball) = computer.countStrikeBall(userNum, answerNum)

            outputView.printStrikeBallCount(strike, ball)

            if (strike == RandomNumConstants.RANDOM_NUM_SIZE) {
                outputView.printSuccess()
                break
            }
        }
    }
}