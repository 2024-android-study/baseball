package baseball

import baseball.enums.BaseballGameNumber
import baseball.view.InputView
import baseball.view.OutputView

class BaseballGame {
    private val outputView = OutputView()
    private val inputView = InputView()
    private val computer = Computer()

    private fun calculateBallStrikeCount(computerNumbers: List<Int>, numbers: List<Int>): Pair<Int, Int> {
        var balls = 0
        var strikes = 0

        for (i: Int in BaseballGameNumber.ZERO.number until BaseballGameNumber.REQUIRED_NUMBER_SIZE.number) {
            //같은 자리에 있는 경우, 다른 자리에 자리에 있는 경우
            if (computerNumbers[i] == numbers[i]) {
                strikes++
            } else if (computerNumbers[i] in numbers) {
                balls++
            }
        }

        return Pair(balls, strikes)
    }

    fun play() {
        var computerNumbers = computer.createNumbers()

        outputView.showGameStartMessage()
        do {
            try {
                val numbers = inputView.readNumbers()

                val (balls, strikes) = calculateBallStrikeCount(computerNumbers, numbers)
                outputView.showBallStrikeCount(balls, strikes)

                if (strikes == BaseballGameNumber.MAX_ALLOWED_STRIKES.number) {
                    outputView.showGameEndMessage()

                    val decision = inputView.readRestartOrExitDecision()

                    if (decision == BaseballGameNumber.RESTART_INPUT.number) {
                        computerNumbers = computer.createNumbers()
                        continue
                    } else if (decision == BaseballGameNumber.END_INPUT.number) {
                        break
                    }
                }

            } catch (e: IllegalArgumentException) {
                e.printStackTrace()
                break
            }
        } while (true)
    }
}