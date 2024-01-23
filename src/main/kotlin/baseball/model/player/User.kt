package baseball.model.player

class User : Player() {
    private val _numbers = mutableListOf<Int>()
    val numbers get() = _numbers

    fun changeNumbers(numbers: List<Int>) {
        this._numbers.clear()
        this._numbers.addAll(numbers)
    }
}
