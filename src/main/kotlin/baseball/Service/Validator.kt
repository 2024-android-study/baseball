package baseball.Service

import baseball.Constants.ErrorConstant
import baseball.Constants.RandomNumConstants
import baseball.Constants.StatementConstant

class Validator {
    // 사용자 입력값 검증
    fun validateInputNum(input: String) {
        // 숫자인지 확인
        require((isNumber(input))) {ErrorConstant.INPUT_NOT_NUMBER}

        // 길이가 3인지 확인
        require(input.length == RandomNumConstants.RANDOM_NUM_SIZE) {ErrorConstant.INPUT_LENGTH_ERROR}

        // 1 ~ 9 사이의 숫자인지 확인
        require(!input.contains(RandomNumConstants.ZERO)) {ErrorConstant.INPUT_VALUE_ERROR}

        // 서로 다른 숫자인지 확인
        require(!isDuplicate((input))) {ErrorConstant.INPUT_DUPLICATE_ERROR}
    }

    // 게임 재시작 입력값 검증
    fun validateRestartNum(input: String) {
        // 숫자인지 확인
        require((isNumber(input))) {ErrorConstant.INPUT_NOT_NUMBER}

        require(input.toInt() == StatementConstant.RESUME || input.toInt() == StatementConstant.STOP) {ErrorConstant.INPUT_VALUE_ERROR}
    }

    // 숫자인지 확인
    private fun isNumber(input: String): Boolean {
        return input.all { ch -> ch.isDigit() }
    }

    // 숫자가 중복되는지 확인
    private fun isDuplicate(input: String): Boolean {
        return input.length != input.toSet().size
    }
}