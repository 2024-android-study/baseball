package baseball.View

import baseball.Constants.ErrorConstant
import baseball.Constants.RandomNumConstants
import baseball.Constants.StatementConstant
import baseball.Constants.ViewConstant
import baseball.Service.Validator
import camp.nextstep.edu.missionutils.Console

class InputView {

    private val validator = Validator()

    // 사용자 입력 받음
    fun userInput(): List<Int> {
        print(ViewConstant.USER_INPUT)
        val input = Console.readLine()

        validator.validateInputNum(input)

        return input.map { it.toString().toInt() }
    }

    // 게임 재시작 여부 확인
    fun restartGame(): Int {
        println(ViewConstant.RESTART_GAME)
        val input = Console.readLine()

        validator.validateRestartNum(input)

        return input.toInt()
    }
}