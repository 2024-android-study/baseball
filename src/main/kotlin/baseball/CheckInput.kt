package baseball

class CheckInput(inputParam: String) {

    var input: String = ""
    private var list = mutableListOf<Int>()

    init {
        if (inputParam.isEmpty()) {
            throw IllegalArgumentException("받은 입력이 없음")
        }
        this.input = inputParam
    }

    fun checkIsValidInput() {
        throwError(checkIsAllNumber(), "숫자 형태가 아님")
        list = returnIntList().toMutableList()
//        println(list)
        throwError(checkIsCountThree(), "숫자 개수가 3개가 아님")
        throwError(checkRange(), "숫자 범위가 1~9가 아님")
        throwError(checkIsAllDifferent(), "모두 다 다른 수가 아님")
    }

    private fun throwError(bool: Boolean, message: String) {
        if (!bool) {
//            println(message)
            throw IllegalArgumentException(message)
        }
    }

    private fun checkIsAllNumber(): Boolean {
        return (input.all { Character.isDigit(it) })
    }

    fun returnIntList(): List<Int> {
        val strings = input.chunked(1).toMutableList()
        val list = strings.map { it.toInt() }.toTypedArray()

        return list.toList()
    }

    private fun checkIsCountThree(): Boolean {
        return (list.size == 3)
    }

    private fun checkRange(): Boolean {
        list.forEach {i ->
            if (i < 1 || i > 9)
                return  false
        }
        return true
    }

    private fun checkIsAllDifferent(): Boolean {
        list.forEach {i ->
            if (list.count{it == i} > 1)
                return false
        }
        return true
    }
}