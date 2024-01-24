package baseball.messages

class BaseballGameExceptionMessage {
    companion object {
        const val ERROR_MISSING_THREE_NUMBERS = "세자리 숫자가 입력되지 않았습니다."
        const val ERROR_NON_NUMERIC_INPUT = "숫자가 아닌 문자를 입력하셨습니다."
        const val ERROR_DUPLICATE_NUMBERS = "중복된 숫자를 입력하셨습니다."
        const val ERROR_INVALID_NUMBER = "입력하신 숫자가 올바른 숫자가 아닙니다."
    }
}