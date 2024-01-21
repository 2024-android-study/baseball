package baseball.util

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

class NumberGeneratorTest {
    val numbers = NumberGenerator.generateNumber()

    @Test
    fun `숫자 3개를 반환하는지 확인`() {
        val numbers = NumberGenerator.generateNumber()
        assertThat(numbers.size).isEqualTo(3)
    }

    @Test
    fun `생성된 숫자가 1부터 9까지 범위에 속하는지 확인`() {
        val numbers = NumberGenerator.generateNumber()
        for (i in numbers) {
            assertThat((1..9).contains(i)).isTrue()
        }
    }

    @Test
    fun `중복된 숫자가 없는지 확인`() {
        val numbers = NumberGenerator.generateNumber()
        assertThat(numbers.toSet().size).isEqualTo(numbers.size)
    }
}