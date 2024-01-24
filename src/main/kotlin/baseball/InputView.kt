package baseball

import camp.nextstep.edu.missionutils.Console

class InputView {
    fun readNumbers(): List<Int> {
        print("숫자를 입력해주세요 : ")
        val numbers = Console.readLine()

        numbersCheck(numbers)

        return numbers.map { it.toString().toInt() }
    }

    fun readRestartInput(): Int {
        println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.")
        val restartInput = Console.readLine()

        restartInputCheck(restartInput)

        return restartInput.toInt()
    }

    fun numbersCheck(numbers: String) {
        isNumber(numbers)
        isValidLength(numbers)
        hasDuplicateNumbers(numbers)
    }

    fun restartInputCheck(restartInput: String) {
        isNumber(restartInput)
        isCorrectRestartInput(restartInput)
    }

    fun isValidLength(numbers: String) {
        if (numbers.length != 3) throw IllegalArgumentException("세자리 숫자가 입력되지 않았습니다.")
    }

    fun isNumber(numbers: String) {
        for(number in numbers) {
            if(!number.isDigit()) throw IllegalArgumentException("숫자가 아닌 문자를 입력하셨습니다.")
        }
    }

    fun hasDuplicateNumbers(numbers: String) {
        if (numbers.length != numbers.toSet().size) throw IllegalArgumentException("중복된 숫자를 입력하셨습니다.")
    }

    fun isCorrectRestartInput(restartInput: String) {
        if (restartInput.toInt() != 1 && restartInput.toInt() != 2)
            throw IllegalArgumentException("입력하신 숫자가 올바른 숫자가 아닙니다.")
    }
}