package baseball

class GamePlayer {
    val opponent = Opponent()

    fun play() {
        playOneSet()
    }

    private fun playOneSet() {
        val answer = opponent.createNum()
        println("숫자 야구 게임을 시작합니다.")
        val input = userInput()
        CheckInput(input).checkIsValidInput()
    }

    private fun userInput(): String {
        print("숫자를 입력해주세요 : ")
        return readLine().toString()
    }
}