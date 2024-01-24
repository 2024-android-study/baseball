package baseball.checker

import baseball.enums.BaseballGameNumber

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
            throw IllegalArgumentException("세자리 숫자가 입력되지 않았습니다.")
    }

    private fun isNumber(numbers: String) {
        for (number in numbers) {
            if (!number.isDigit()) throw IllegalArgumentException("숫자가 아닌 문자를 입력하셨습니다.")
        }
    }

    private fun hasDuplicateNumbers(numbers: String) {
        if (numbers.length != numbers.toSet().size) throw IllegalArgumentException("중복된 숫자를 입력하셨습니다.")
    }

    private fun isCorrectRestartInput(restartInput: String) {
        if (restartInput.toInt() != BaseballGameNumber.RESTART_INPUT.number && restartInput.toInt() != BaseballGameNumber.END_INPUT.number)
            throw IllegalArgumentException("입력하신 숫자가 올바른 숫자가 아닙니다.")
    }
}