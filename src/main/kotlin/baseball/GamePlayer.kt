package baseball

class GamePlayer {
    val opponent = Opponent()

    var answerList = mutableListOf<Int>()

    fun play() {
        playOneSet()
    }

    private fun playOneSet() {
        answerList = opponent.createNum().toMutableList()
        println("정답: $answerList")
        println("숫자 야구 게임을 시작합니다.")
        repeatUntilGetAnswer()
    }

    private fun repeatUntilGetAnswer() {
        do {
            val input = userInput()
            CheckInput(input).checkIsValidInput()
            val inputList = CheckInput(input).returnIntList()
            val isFinished = CompareAnswer(answerList, inputList).run()
        } while (!isFinished)
        println("3개의 숫자를 모두 맞히셨습니다! 게임 종료")
    }

    private fun userInput(): String {
        print("숫자를 입력해주세요 : ")
        return readLine().toString()
    }
}