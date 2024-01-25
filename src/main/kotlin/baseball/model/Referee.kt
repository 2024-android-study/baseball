package baseball.model

import baseball.config.ResultRule
import baseball.extension.isBall
import baseball.extension.isStrike

class Referee {
    private val result = mutableListOf<ResultRule>()

    fun getEachCount(): BallStrikeCount {
        var strikeCount = 0
        var ballCount = 0
        for ((k, v) in result.groupingBy { it.result }.eachCount()) {
            when (k) {
                ResultRule.STRIKE.result -> strikeCount = v
                ResultRule.BALL.result -> ballCount = v
            }
        }
        return BallStrikeCount(strikeCount, ballCount)
    }

    fun saveResult(userNumbers: List<Int>, answerNumbers: List<Int>) {
        result.clear()
        for ((index, value) in userNumbers.withIndex()) {
            result.add(evaluateNumbers(index, value, answerNumbers))
        }
    }

    private fun evaluateNumbers(index: Int, number: Int, answerNumbers: List<Int>): ResultRule {
        return when {
            number.isStrike(index, answerNumbers) -> ResultRule.STRIKE
            number.isBall(index, answerNumbers) -> ResultRule.BALL
            else -> ResultRule.NOTHING
        }
    }
}