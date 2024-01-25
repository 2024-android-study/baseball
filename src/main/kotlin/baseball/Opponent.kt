package baseball

import camp.nextstep.edu.missionutils.Randoms

class Opponent {
    fun generateRandomNumber(): List<Int> {
        val randomNumber = Randoms.pickNumberInRange(1, 9)
        val list = mutableListOf<Int>()

        while (list.size < 3) {
            if (!list.contains(randomNumber)) {
                list.add(randomNumber)
            }
        }
        return list
    }
}