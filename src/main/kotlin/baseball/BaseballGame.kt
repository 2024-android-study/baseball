package baseball

import baseball.enums.BaseballNumber

class BaseballGame {
    private val outputView = OutputView()
    private val inputView = InputView()
    private val computer = Computer()

    fun calculateBallStrikeCount(computerNumbers: List<Int>, inputNumbers: List<Int>): Pair<Int, Int> {
        var balls = 0
        var strikes = 0

        for (i: Int in BaseballNumber.ZERO.number until BaseballNumber.REQUIRED_NUMBER_SIZE.number) {
            //같은 자리에 있는 경우, 다른 자리에 자리에 있는 경우
            if (computerNumbers[i] == inputNumbers[i]) {
                strikes++
            } else if (computerNumbers[i] in inputNumbers) {
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
                val inputNumbers = inputView.readNumbers()

                val (balls, strikes) = calculateBallStrikeCount(computerNumbers, inputNumbers)
                outputView.showCountMessage(balls, strikes)

                if (strikes == BaseballNumber.MAX_ALLOWED_STRIKES.number) {
                    outputView.showGameEndMessage()

                    val restartInput = inputView.readRestartInput()

                    if (restartInput == BaseballNumber.RESTART_INPUT.number) {
                        computerNumbers = computer.createNumbers()
                        continue
                    } else if (restartInput == BaseballNumber.END_INPUT.number) {
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