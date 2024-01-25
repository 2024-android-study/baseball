package baseball

class GamePlayer {
    val opponent = Opponent()

    var answerList = mutableListOf<Int>()

    fun play() {
        playOneSet()
    }

    private fun playOneSet() {
        answerList = opponent.generateRandomNumber().toMutableList()
//        println("정답: $answerList")
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
        questionToRestartGame()
    }

    private fun userInput(): String {
        print("숫자를 입력해주세요 : ")
        return readLine().toString()
    }

    private fun questionToRestartGame() {
        println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.")
        val input = readLine().toString()
        if (input != "1" && input != "2") {
            throw IllegalArgumentException("유효하지 않은 숫자")
        }
        nextStep(input.toInt())
    }

    private fun nextStep(choice: Int) {
        if (choice == 1) playOneSet()
        else return
    }
}