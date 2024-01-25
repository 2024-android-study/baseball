package baseball.extension

import baseball.config.MAX_NUMBER_SIZE
import baseball.model.BallStrikeCount

fun Int.isStrike(index: Int, answerNumbers: List<Int>): Boolean {
    return answerNumbers.indexOf(this) == index && answerNumbers.contains(this)
}

fun Int.isBall(index: Int, answerNumbers: List<Int>): Boolean {
    return answerNumbers.contains(this) && answerNumbers.indexOf(this) != index
}

fun BallStrikeCount.isAllStrike(): Boolean {
    return strikeCount == MAX_NUMBER_SIZE
}

fun BallStrikeCount.isNothing(): Boolean {
    return strikeCount == 0 && ballCount == 0
}