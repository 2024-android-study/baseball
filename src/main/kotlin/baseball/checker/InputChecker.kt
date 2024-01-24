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
    fun restartInputCheck(restartInput: String) {
        isNumber(restartInput)
        isCorrectRestartInput(restartInput)
    }

    private fun isValidLength(numbers: String) {
        if (numbers.length != BaseballGameNumber.REQUIRED_NUMBER_SIZE.number)
            throw IllegalArgumentException(BaseballGameExceptionMessage.ERROR_MISSING_THREE_NUMBERS)
    }

    private fun isNumber(numbers: String) {
        for (number in numbers) {
            if (!number.isDigit())
                throw IllegalArgumentException(BaseballGameExceptionMessage.ERROR_NON_NUMERIC_INPUT)
        }
    }

    private fun hasDuplicateNumbers(numbers: String) {
        if (numbers.length != numbers.toSet().size)
            throw IllegalArgumentException(BaseballGameExceptionMessage.ERROR_DUPLICATE_NUMBERS)
    }

    private fun isCorrectRestartInput(restartInput: String) {
        if (restartInput.toInt() != BaseballGameNumber.RESTART_INPUT.number
                && restartInput.toInt() != BaseballGameNumber.END_INPUT.number)
            throw IllegalArgumentException(BaseballGameExceptionMessage.ERROR_INVALID_NUMBER)
    }
}