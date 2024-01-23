package baseball

class BaseballGame {
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
}