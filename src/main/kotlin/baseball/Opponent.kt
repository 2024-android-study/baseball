package baseball

import camp.nextstep.edu.missionutils.Randoms

class Opponent {
    fun generateRandomNumber(): List<Int> {
        val list = mutableListOf<Int>()
        var randomNumber = 0

        while (list.size < 3) {
            randomNumber = Randoms.pickNumberInRange(1, 9)
            if (!list.contains(randomNumber)) {
                list.add(randomNumber)
            }
        }
        return list
    }
}