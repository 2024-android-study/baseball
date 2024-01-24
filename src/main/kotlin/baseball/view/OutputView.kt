package baseball.view

import baseball.enums.BaseballGameNumber
import baseball.messages.BaseballGameMessage

class OutputView {
    fun showGameStartMessage() {
        println(BaseballGameMessage.GAME_START_MESSAGE)
    }

    fun showCountMessage(ball: Int, strike: Int) {
        when {
            ball > BaseballGameNumber.ZERO.number && strike > BaseballGameNumber.ZERO.number
            -> println(BaseballGameMessage.BALL_MESSAGE.format(ball) + " " + BaseballGameMessage.STRIKE_MESSAGE.format(strike))

            ball > BaseballGameNumber.ZERO.number -> println(BaseballGameMessage.BALL_MESSAGE.format(ball))
            strike > BaseballGameNumber.ZERO.number -> println(BaseballGameMessage.STRIKE_MESSAGE.format(strike))
            else -> println(BaseballGameMessage.NOTHING_MESSAGE)
        }
    }

    fun showGameEndMessage() {
        println(BaseballGameMessage.GAME_END_MESSAGE.format(BaseballGameNumber.MAX_ALLOWED_STRIKES.number))
    }
}