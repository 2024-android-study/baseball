package baseball

import camp.nextstep.edu.missionutils.Console

class InputView {
    fun readNumbers(): List<Int> {
        print("숫자를 입력해주세요 : ")
        val numbers = Console.readLine()
        return numbers.map { it.toString().toInt() }
    }

    fun readRestartInput(): Int {
        print("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.")
        val restartInput = Console.readLine()
        return restartInput.toInt()
    }
}