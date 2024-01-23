package baseball.view

import camp.nextstep.edu.missionutils.Console

class InputView {
    fun readNumbers(): List<Int> {
        print(READ_NUMBER_MESSAGE)
        val input = Console.readLine()
        return input.map { it.digitToInt() }
    }

    fun readRestart(): Int {
        println(READ_RESTART_MESSAGE)
        val input = Console.readLine()
        return input.toInt()
    }

    companion object {
        private const val READ_NUMBER_MESSAGE = "숫자를 입력해주세요 : "
        private const val READ_RESTART_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."
    }
}
