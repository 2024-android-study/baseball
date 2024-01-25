package baseball

class OutputView {
    // 게임 시작
    fun printStartGame() {
        println(Constant.START_GAME)
    }

    // 3스트라이크인 경우 사용
    fun printSuccess() {
        println(Constant.SUCCESS_GAME)
    }

    // 힌트 출력
    fun printStrikeBallCount(strike: Int, ball: Int) {
        println(makeHint(strike, ball))
    }

    // 힌트 만들기
    private fun makeHint(strike: Int, ball: Int): String {
        if (strike == 0 && ball == 0) {
            return Constant.NOTHING
        }

        var result = ""

        if (ball > 0) {
            result += "${ball}${Constant.BALL} "
        }

        if (strike > 0) {
            result += "${strike}${Constant.STRIKE}"
        }

        return result
    }
}