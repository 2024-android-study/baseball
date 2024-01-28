package baseball.Service

import baseball.Constants.RandomNumConstants
import camp.nextstep.edu.missionutils.Randoms

class Computer {
    // 컴퓨터 난수 생성
    fun createNum(): List<Int> {
        val computer = mutableListOf<Int>()

        while (computer.size < RandomNumConstants.RANDOM_NUM_SIZE) {
            val randomNumber = Randoms.pickNumberInRange(RandomNumConstants.MIN_RANDOM_NUM, RandomNumConstants.MAX_RANDOM_NUM)

            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber)
            }
        }

        println(computer)

        return computer
    }

    // 스트라이크, 볼 개수 세기
    fun countStrikeBall(input: List<Int>, computer: List<Int>): Pair<Int, Int> {
        var strike = 0
        var ball = 0

        for (i in RandomNumConstants.ZERO.toInt() until RandomNumConstants.RANDOM_NUM_SIZE) {
            if (input[i] == computer[i]) { // 같은 자리에 있는 숫자가 같은 경우
                strike++
            } else if (computer.contains(input[i])) { // 해당 숫자가 포함되어 있는 경우
                ball++
            }
        }

        return Pair(strike, ball)
    }
}