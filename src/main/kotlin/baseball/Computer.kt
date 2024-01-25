package baseball

import baseball.Constants.RandomNumConstants
import camp.nextstep.edu.missionutils.Randoms

class Computer {
    // 컴퓨터 난수 생성
    fun createNum(): List<Int> {
        val computer = mutableListOf<Int>()

        while (computer.size < RandomNumConstants.MAX_NUM_SIZE) {
            val randomNumber = Randoms.pickNumberInRange(RandomNumConstants.MIN_RANDOM_NUM, RandomNumConstants.MAX_RANDOM_NUM)

            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber)
            }
        }

        println(computer)

        return computer
    }
}