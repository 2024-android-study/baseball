package baseball

class CompareAnswer(answer: List<Int>, input: List<Int>) {

    var answer = mutableListOf<Int>()
    var input = mutableListOf<Int>()

    init {
        this.answer = answer.toMutableList()
        this.input = input.toMutableList()
    }

    fun run(): Boolean {
        printCompareResult(compareAnswer())
        return isFinished(compareAnswer().second)
    }

    fun compareAnswer(): Pair<Int, Int> {
        var strike = 0
        var ball = 0
        var i = 0
        input.forEach { k ->
            if (answer.contains(k)) {
                if (answer[i] == input[i]) strike++
                else ball++
            }
            i++
        }
        return Pair(ball, strike)
    }

    fun printCompareResult(pair: Pair<Int, Int>) {
        if (pair.first == 0 && pair.second == 0) {
            println("낫싱")
            return
        }
        if (pair.first != 0) {
            print("${pair.first}볼 ")
        }
        if (pair.second != 0) {
            print("${pair.second}스트라이크")
        }
        println()
    }

    fun isFinished(strike: Int): Boolean {
        if (strike == 3) return true
        return false
    }
}