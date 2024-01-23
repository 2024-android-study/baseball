package baseball.mdel

import baseball.extension.isBall
import baseball.extension.isStrike
import baseball.model.Referee
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

class Referee {

    @Test
    fun `스트라이크가 아닐 경우 false를 반환하는지 확인`() {
        val numbers = listOf(1, 2, 3)
        val answer = listOf(4, 3, 1)
        for ((index, value)in numbers.withIndex()) {
            assertThat(value.isStrike(index, answer)).isFalse()
        }
    }

    @Test
    fun `볼일 경우 True를 반환하는지 확인`() {
        val numbers = listOf(1, 2, 3)
        val answer = listOf(2, 3, 1)
        for ((index, value)in numbers.withIndex()) {
            assertThat(value.isBall(index, answer)).isTrue()
        }
    }

    @Test
    fun `숫자를 맞춘 결과가 초기화되는지 확인`() {
        val referee = Referee()
        val answer = listOf(1, 2, 3)
        val oldNumbers = listOf(3, 2, 1)
        val newNumbers = listOf(4, 5, 6)
        referee.saveResult(oldNumbers, answer)
        val beforeResult = referee.result
        referee.saveResult(newNumbers, answer)
        val afterResult = referee.result
        assertThat(afterResult.size).isEqualTo(beforeResult.size)
    }
}