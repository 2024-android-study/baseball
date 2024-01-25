package baseball

import baseball.Constant.Companion.INPUT
import camp.nextstep.edu.missionutils.Console
class Input {
    fun getInput(): List<Int> {
        print(INPUT)
        val input = Console.readLine()
        checkInput(input)
        return input.map { it.toString().toInt() }
    }

    private fun checkInput(input: String) : Boolean{
        if(input.length != 3) throw IllegalArgumentException("세 자리 숫자를 입력해주세요.")

        for(i in input) {
            if(!i.isDigit()) throw IllegalArgumentException("숫자를 입력해주세요.")
        }

        if(input.toSet().size != input.length) throw IllegalArgumentException("서로 다른 숫자를 입력해주세요.")

        if(input.all { it in '1'..'9' }) throw IllegalArgumentException("1~9 범위의 숫자를 입력해주세요.")

        return true
    }

}