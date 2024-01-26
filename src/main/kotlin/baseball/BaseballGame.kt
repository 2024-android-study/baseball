package baseball

import baseball.Constant.Companion.END_INPUT

class BaseballGame {
    private val input = Input()
    private val output = Output()
    private val opponent = Opponent()

    fun run() {
        output.printStart()
        var answer = opponent.createNumbers()
        do {
            val hintResult = computeHint(input.getInput(), answer)
            output.printHint(hintResult[0], hintResult[1])

            if(hintResult[1] == 3) {
                output.printCorrectAndEnd()
                if(input.getRestartOrEndInput() == 2) break
                else {
                    answer = opponent.createNumbers()
                    continue
                }
            }

        }
        while (true)
    }



    private fun computeHint(input: List<Int>, answer: List<Int>): List<Int> {
        var strike = 0
        var ball = 0

        for(i in 0..2) {
            if(input[i] == answer[i]) strike++
            else if (answer.contains(input[i])) ball++
        }

        return listOf(ball, strike)
    }
}