package baseball.view

import baseball.checker.InputChecker
import baseball.enums.BaseballGameNumber
import baseball.messages.BaseballGameMessage
import camp.nextstep.edu.missionutils.Console

class InputView {
    private val inputChecker = InputChecker()

    fun readNumbers(): List<Int> {
        print(BaseballGameMessage.INPUT_MESSAGE)
        val numbers = Console.readLine()

        inputChecker.numbersCheck(numbers)

        return numbers.map { it.toString().toInt() }
    }

    fun readRestartInput(): Int {
        println(BaseballGameMessage.ASK_RESTART_OR_END_MESSAGE.format(
                BaseballGameNumber.RESTART_INPUT.number,
                BaseballGameNumber.END_INPUT.number
        ))
        val restartInput = Console.readLine()

        inputChecker.restartInputCheck(restartInput)

        return restartInput.toInt()
    }
}