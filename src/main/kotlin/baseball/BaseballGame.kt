package baseball

class BaseballGame {
    private val input = Input()
    private val output = Output()
    private val opponent = Opponent()
    fun computeHint(input: List<Int>, answer: List<Int>): List<Int> {
        var strike = 0
        var ball = 0

        for(i in 0..2) {
            if(input[i] == answer[i]) strike++
            else if (answer.contains(input[i])) ball++
        }

        return listOf(ball, strike)
    }
}