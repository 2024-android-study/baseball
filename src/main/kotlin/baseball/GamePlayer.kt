package baseball

class GamePlayer {
    val opponent = Opponent()

    fun play() {
        playOneSet()
    }

    private fun playOneSet() {
        val answerList = opponent.createNum()
        println("정답: $answerList")
        println("숫자 야구 게임을 시작합니다.")
        val input = userInput()
        CheckInput(input).checkIsValidInput()
        val inputList = CheckInput(input).returnIntList()
        CompareAnswer(answerList, inputList).run()
    }

    private fun userInput(): String {
        print("숫자를 입력해주세요 : ")
        return readLine().toString()
    }
}