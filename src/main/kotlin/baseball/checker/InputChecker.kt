package baseball.checker

import baseball.enums.BaseballGameNumber
import baseball.messages.BaseballGameExceptionMessage

class InputChecker {
    //야구 숫자 입력 체크
    fun numbersCheck(numbers: String) {
        isNumber(numbers)
        isValidLength(numbers)
        hasDuplicateNumbers(numbers)
    }

    //재시작 종료 여부 체크
    fun restartOrExitDecisionCheck(decision: String) {
        isNumber(decision)
        isCorrectRestartInput(decision)
    }

    private fun isValidLength(str: String) {
        if (str.length != BaseballGameNumber.REQUIRED_NUMBER_SIZE.number)
            throw IllegalArgumentException(BaseballGameExceptionMessage.ERROR_MISSING_THREE_NUMBERS)
    }

    private fun isNumber(str: String) {
        for (number in str) {
            if (!number.isDigit())
                throw IllegalArgumentException(BaseballGameExceptionMessage.ERROR_NON_NUMERIC_INPUT)
        }
    }

    private fun hasDuplicateNumbers(str: String) {
        if (str.length != str.toSet().size)
            throw IllegalArgumentException(BaseballGameExceptionMessage.ERROR_DUPLICATE_NUMBERS)
    }

    private fun isCorrectRestartInput(str: String) {
        if (str.toInt() != BaseballGameNumber.RESTART_INPUT.number
                && str.toInt() != BaseballGameNumber.END_INPUT.number)
            throw IllegalArgumentException(BaseballGameExceptionMessage.ERROR_INVALID_NUMBER)
    }
}