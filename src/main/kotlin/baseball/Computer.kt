package baseball

import baseball.enums.BaseballNumber
import camp.nextstep.edu.missionutils.Randoms

class Computer {
    fun createNumbers(): List<Int> {
        val numbers = mutableListOf<Int>()

        while (numbers.size < BaseballNumber.REQUIRED_NUMBER_SIZE.number) {
            val randomNumber = Randoms.pickNumberInRange(BaseballNumber.NUMBER_RANGE_START.number, BaseballNumber.NUMBER_RANGE_END.number)
            if (!numbers.contains(randomNumber)) {
                numbers.add(randomNumber)
            }
        }

        return numbers.toList()
    }
}