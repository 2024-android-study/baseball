package baseball.view

import baseball.enums.BaseballGameNumber

class OutputView {
    fun showGameStartMessage() {
        println("숫자 야구 게임을 시작합니다.")
    }

    fun showCountMessage(ball: Int, strike: Int) {
        when {
            ball > BaseballGameNumber.ZERO.number && strike > BaseballGameNumber.ZERO.number -> println("${ball}볼 ${strike}스트라이크")
            ball > BaseballGameNumber.ZERO.number -> println("${ball}볼")
            strike > BaseballGameNumber.ZERO.number -> println("${strike}스트라이크")
            else -> println("낫싱")
        }
    }

    fun showGameEndMessage() {
        println("${BaseballGameNumber.MAX_ALLOWED_STRIKES.number}개의 숫자를 모두 맞히셨습니다! 게임 종료")
    }
}