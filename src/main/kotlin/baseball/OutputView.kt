package baseball

class OutputView {
    fun showGameStartMessage() {
        println("숫자 야구 게임을 시작합니다.")
    }

    fun showCountMessage(ball: Int, strike: Int) {
        when {
            ball > 0 && strike > 0 -> println("${ball}볼 ${strike}스트라이크")
            ball > 0 -> println("${ball}볼")
            strike > 0 -> println("${strike}스트라이크")
            else -> println("낫싱")
        }
    }
}