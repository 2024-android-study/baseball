package baseball

import baseball.enums.BaseballGameNumber
import camp.nextstep.edu.missionutils.Randoms

class Computer {
    fun createNumbers(): List<Int> {
        val numbers = mutableListOf<Int>()

        while (numbers.size < BaseballGameNumber.REQUIRED_NUMBER_SIZE.number) {
            val randomNumber = Randoms.pickNumberInRange(BaseballGameNumber.NUMBER_RANGE_START.number, BaseballGameNumber.NUMBER_RANGE_END.number)
            if (!numbers.contains(randomNumber)) {
                numbers.add(randomNumber)
            }
        }

        return numbers.toList()
    }
}