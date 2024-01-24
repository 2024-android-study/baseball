package baseball.view

import baseball.enums.BaseballGameNumber
import baseball.messages.BaseballGameMessage

class OutputView {
    fun showGameStartMessage() {
        println(BaseballGameMessage.GAME_START_MESSAGE)
    }

    fun showBallStrikeCount(balls: Int, strikes: Int) {
        when {
            balls > BaseballGameNumber.ZERO.number && strikes > BaseballGameNumber.ZERO.number
            -> println(BaseballGameMessage.BALL_MESSAGE.format(balls) + " " + BaseballGameMessage.STRIKE_MESSAGE.format(strikes))

            balls > BaseballGameNumber.ZERO.number -> println(BaseballGameMessage.BALL_MESSAGE.format(balls))
            strikes > BaseballGameNumber.ZERO.number -> println(BaseballGameMessage.STRIKE_MESSAGE.format(strikes))
            else -> println(BaseballGameMessage.NOTHING_MESSAGE)
        }
    }

    fun showGameEndMessage() {
        println(BaseballGameMessage.GAME_END_MESSAGE.format(BaseballGameNumber.MAX_ALLOWED_STRIKES.number))
    }
}