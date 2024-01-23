package baseball.view

class OutputView {
    fun printStartGame() = println(START_GAME_MESSAGE)

    companion object {
        private const val START_GAME_MESSAGE = "숫자 야구 게임을 시작합니다."
    }
}
