package baseball

import java.util.*

class CheckInput(inputParam: String) {

    var input: String = ""

    init {
        if (inputParam.isEmpty()) {
            throw IllegalArgumentException("받은 입력이 없음")
        }
        this.input = inputParam
    }

    fun checkIsValidInput() {
        throwError(checkIsAllNumber(input), "숫자 형태가 아님")
        val list = returnIntList(input)
//        println(list)
        throwError(checkIsCountThree(list), "숫자 개수가 3개가 아님")
        throwError(checkRange(list), "숫자 범위가 1~9가 아님")
        throwError(checkIsAllDifferent(list), "모두 다 다른 수가 아님")
    }

    private fun throwError(bool: Boolean, message: String) {
        if (!bool) {
//            println(message)
            throw IllegalArgumentException(message)
        }
    }

    private fun checkIsAllNumber(input: String): Boolean {
        return (input.all { Character.isDigit(it) })
    }

    private fun returnIntList(input: String): List<Int> {
        val strings = input.chunked(1).toMutableList()
        val list = strings.map { it.toInt() }.toTypedArray()

        return list.toList()
    }

    private fun checkIsCountThree(list: List<Int>): Boolean {
        return (list.size == 3)
    }

    private fun checkRange(list: List<Int>): Boolean {
        list.forEach {i ->
            if (i < 1 || i > 9)
                return  false
        }
        return true
    }

    private fun checkIsAllDifferent(list: List<Int>): Boolean {
        list.forEach {i ->
            if (list.count{it == i} > 1)
                return false
        }
        return true
    }
}