package baseball.view

import baseball.checker.InputChecker
import baseball.enums.BaseballNumber
import camp.nextstep.edu.missionutils.Console

class InputView {
    private val inputChecker = InputChecker()

    fun readNumbers(): List<Int> {
        print("숫자를 입력해주세요 : ")
        val numbers = Console.readLine()

        inputChecker.numbersCheck(numbers)

        return numbers.map { it.toString().toInt() }
    }

    fun readRestartInput(): Int {
        println("게임을 새로 시작하려면 ${BaseballNumber.RESTART_INPUT.number}, 종료하려면 ${BaseballNumber.END_INPUT.number}를 입력하세요.")
        val restartInput = Console.readLine()

        inputChecker.restartInputCheck(restartInput)

        return restartInput.toInt()
    }
}