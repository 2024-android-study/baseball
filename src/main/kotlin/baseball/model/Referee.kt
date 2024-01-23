package baseball.model

import baseball.config.ResultRule
import baseball.extension.isBall
import baseball.extension.isStrike

class Referee {

    private val _result = mutableListOf<ResultRule>()
    val result get() = _result

    fun saveResult(userNumbers: List<Int>, answerNumbers: List<Int>) {
        _result.clear()
        for ((index, value) in userNumbers.withIndex()) {
            _result.add(evaluateNumbers(index, value, answerNumbers))
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