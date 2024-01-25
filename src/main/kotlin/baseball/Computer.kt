package baseball

import camp.nextstep.edu.missionutils.Randoms

class Computer {
    // 컴퓨터 난수 생성
    fun createNum(): List<Int> {
        val computer = mutableListOf<Int>()

        while (computer.size < 3) {
            val randomNumber = Randoms.pickNumberInRange(1, 9)

            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber)
            }
        }

        println(computer)

        return computer
    }
}