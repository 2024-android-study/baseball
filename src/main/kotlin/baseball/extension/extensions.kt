package baseball.extension

fun Int.isStrike(index: Int, answerNumbers: List<Int>): Boolean {
    return answerNumbers.indexOf(this) == index && answerNumbers.contains(this)
}

fun Int.isBall(index: Int, answerNumbers: List<Int>): Boolean {
    return answerNumbers.contains(this) && answerNumbers.indexOf(this) != index
}