package baseball

import camp.nextstep.edu.missionutils.Console

class InputView {
    // 사용자 입력 받음
    fun userInput(): List<Int> {
        print(Constant.USER_INPUT)

        val input = Console.readLine()
        return input.map { it.toString().toInt() }
    }

    // 게임 재시작 여부 확인
    fun restartGame(): Int {
        println(Constant.RESTART_GAME)

        val input = Console.readLine()
        return input.toInt()
    }
}