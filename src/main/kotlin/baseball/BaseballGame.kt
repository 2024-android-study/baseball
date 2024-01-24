package baseball

class BaseballGame {
    private val outputView = OutputView()
    private val inputView = InputView()
    private val computer= Computer()

    fun calculateBallStrikeCount(computerNumbers: List<Int>, inputNumbers: List<Int>): Pair<Int, Int> {
        var balls = 0
        var strikes = 0

        for (i: Int in 0 until 3) {
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

                if (strikes == 3) {
                    outputView.showGameEndMessage()

                    val restartInput = inputView.readRestartInput()

                    if (restartInput == 1) {
                        computerNumbers = computer.createNumbers()
                        continue
                    } else if (restartInput == 2) {
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