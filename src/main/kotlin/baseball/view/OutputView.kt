package baseball.view

import baseball.config.COUNT_ZERO
import baseball.config.MAX_NUMBER_SIZE
import baseball.config.ResultRule
import baseball.model.BallStrikeCount

class OutputView {
    fun printStartGame() = println(START_GAME_MESSAGE)

    fun printAllStrike() {
        println(ALL_STRIKE_MESSAGE.format(MAX_NUMBER_SIZE, MAX_NUMBER_SIZE))
    }

    fun printNothing() = println(ResultRule.NOTHING.result)

    fun printNormalResult(result: BallStrikeCount) {
        if (result.ballCount != COUNT_ZERO) print(BALL_MESSAGE.format(result.ballCount))
        if (result.strikeCount != COUNT_ZERO) print(STRIKE_MESSAGE.format(result.strikeCount))
        println()
    }

    companion object {
        private const val START_GAME_MESSAGE = "숫자 야구 게임을 시작합니다."
        private const val ALL_STRIKE_MESSAGE = "%d스트라이크\n%d개의 숫자를 모두 맞히셨습니다! 게임 종료"
        private const val STRIKE_MESSAGE = "%d스트라이크"
        private const val BALL_MESSAGE = "%d볼 "
    }
}
