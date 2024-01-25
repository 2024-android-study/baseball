package baseball

import baseball.Constants.ResultConstant
import baseball.Constants.ViewConstant

class OutputView {
    // 게임 시작
    fun printStartGame() {
        println(ViewConstant.START_GAME)
    }

    // 3스트라이크인 경우 사용
    fun printSuccess() {
        println(ViewConstant.SUCCESS_GAME)
    }

    // 힌트 출력
    fun printStrikeBallCount(strike: Int, ball: Int) {
        println(makeHint(strike, ball))
    }

    // 힌트 만들기
    private fun makeHint(strike: Int, ball: Int): String {
        return when {
            strike == 0 && ball == 0 -> ResultConstant.NOTHING

            ball == 0 -> String.format(ResultConstant.STRIKE, strike)

            strike == 0 -> String.format(ResultConstant.BALL, ball)

            else -> String.format(ResultConstant.BALL_AND_STRIKE, ball, strike)
        }

//        if (strike == 0 && ball == 0) {
//            return ResultConstant.NOTHING
//        }
//
//        var result = ""
//
//        if (ball > 0) {
//            result += "${ball}${ResultConstant.BALL} "
//        }
//
//        if (strike > 0) {
//            result += "${strike}${ResultConstant.STRIKE}"
//        }
//
//        return result
    }
}