package baseball.view

import camp.nextstep.edu.missionutils.Console

class InputView {
    fun readNumbers(): List<Int> {
        print(READ_NUMBER_MESSAGE)
        val input = Console.readLine()
        return input.map { it.digitToInt() }
    }

    companion object {
        private const val READ_NUMBER_MESSAGE = "숫자를 입력해주세요 : "
    }
}
