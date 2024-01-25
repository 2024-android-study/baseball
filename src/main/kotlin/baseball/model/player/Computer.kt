package baseball.model.player

class Computer(
    val numbers: List<Int>
): Player() {
    companion object {
        fun create(numbers: List<Int>): Computer {
            return Computer(numbers)
        }
    }
}