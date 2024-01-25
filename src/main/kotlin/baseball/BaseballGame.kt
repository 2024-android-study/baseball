package baseball

import baseball.View.InputView
import baseball.View.OutputView

class BaseballGame {

    private val inputView = InputView()
    private val outputView = OutputView()
    private val computer = Computer()

    fun play() {
        do {
            game()
        } while (inputView.restartGame())
    }

    private fun game() {
        outputView.printStartGame()

        val answerNum = computer.createNum()

        while (true) {
            val userNum = inputView.userInput()
            val (strike, ball) = countStrikeBall(userNum, answerNum)

            outputView.printStrikeBallCount(strike, ball)

            if (strike == 3) {
                outputView.printSuccess()
                break
            }
        }
    }

    // 스트라이크, 볼 개수 세기
    private fun countStrikeBall(input: List<Int>, computer: List<Int>): Pair<Int, Int> {
        var strike = 0
        var ball = 0

        for (i in 0 until 3) {
            if (input[i] == computer[i]) { // 같은 자리에 있는 숫자가 같은 경우
                strike++
            } else if (computer.contains(input[i])) { // 해당 숫자가 포함되어 있는 경우
                ball++
            }
        }

        return Pair(strike, ball)
    }
}