package baseball

import baseball.Constant.Companion.END_INPUT
import baseball.Constant.Companion.ERROR_DUPLICATE
import baseball.Constant.Companion.ERROR_IS_NUMBERS
import baseball.Constant.Companion.ERROR_RANGE
import baseball.Constant.Companion.ERROR_RESTART
import baseball.Constant.Companion.ERROR_THREE_NUMBERS
import baseball.Constant.Companion.INPUT
import baseball.Constant.Companion.RESTART_INPUT
import camp.nextstep.edu.missionutils.Console
class Input {
    fun getInput(): List<Int> {
        print(INPUT)
        val input = Console.readLine()
        checkInput(input)
        return input.map { it.toString().toInt() }
    }

    private fun checkInput(input: String) : Boolean{
        if(input.length != 3) throw IllegalArgumentException(ERROR_THREE_NUMBERS)

        for(i in input) {
            if(!i.isDigit()) throw IllegalArgumentException(ERROR_IS_NUMBERS)
        }

        if(input.toSet().size != input.length) throw IllegalArgumentException(ERROR_DUPLICATE)

        if(input.any { it !in '1'..'9' }) throw IllegalArgumentException(ERROR_RANGE)

        return true
    }

    fun getRestartOrEndInput(): Int {
        val input = Console.readLine()
        checkRestartOrEndInput(input)
        return input.toInt()
    }

    private fun checkRestartOrEndInput(input: String) {
        if(input != END_INPUT && input != RESTART_INPUT)
            throw IllegalArgumentException(ERROR_RESTART)
    }
}