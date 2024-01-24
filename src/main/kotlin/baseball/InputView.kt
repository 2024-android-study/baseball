package baseball

import camp.nextstep.edu.missionutils.Console

class InputView {
    // 사용자 입력 받음
    fun userInput(): List<Int> {
        print(Constant.USER_INPUT)
        val input = Console.readLine()

        validateInputNum(input)

        return input.map { it.toString().toInt() }
    }

    // 게임 재시작 여부 확인
    fun restartGame(): Int {
        println(Constant.RESTART_GAME)
        val input = Console.readLine()

        validateRestartNum(input)

        return input.toInt()
    }

    // 사용자 입력값 검증
    private fun validateInputNum(input: String) {
        // 숫자인지 확인
        if (!isNumber(input)) {
            throw IllegalArgumentException(Constant.INPUT_NOT_NUMBER)
        }

        // 길이가 3인지 확인
        if (input.length != 3) {
            throw IllegalArgumentException(Constant.INPUT_LENGTH_ERROR)
        }

        // 1 ~ 9 사이의 숫자인지 확인
        if (input.contains("0")) {
            throw IllegalArgumentException(Constant.INPUT_VALUE_ERROR)
        }

        // 서로 다른 숫자인지 확인
        if (isDuplicate(input)) {
            throw IllegalArgumentException(Constant.INPUT_DUPLICATE_ERROR)
        }
    }

    // 게임 재시작 입력값 검증
    private fun validateRestartNum(input: String) {
        // 숫자인지 확인
        if (!isNumber(input)) {
            throw IllegalArgumentException(Constant.INPUT_NOT_NUMBER)
        }

        if (input.toInt() != 1 && input.toInt() != 2) {
            throw IllegalArgumentException(Constant.INPUT_VALUE_ERROR)
        }
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