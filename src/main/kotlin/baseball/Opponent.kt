package baseball

class Opponent {
    fun createNum(): List<Int> {
        val range = (1..9)
        val list = mutableListOf<Int>()
        var num = 0

        while (list.size < 3) {
            num = range.random()
            if (!list.contains(num)) {
                list.add(num)
            }
        }
        return list
    }
}