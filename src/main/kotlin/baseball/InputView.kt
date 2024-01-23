package baseball

import camp.nextstep.edu.missionutils.Console

class InputView {
    fun readNumbers(): List<Int> {
        print("숫자를 입력해주세요 : ")
        val numberString = Console.readLine()
        return numberString.map { it.toString().toInt() }
    }
}