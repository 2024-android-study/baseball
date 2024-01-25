package baseball

import baseball.Constant.Companion.BALL
import baseball.Constant.Companion.NOTHING
import baseball.Constant.Companion.START
import baseball.Constant.Companion.STRIKE

class Output {
    fun printStart() {
        print(START)
    }

    fun printHint(ball: Int, strike: Int) {
        if(strike == 0 && ball == 0) {
            println(NOTHING)
            return
        }
        var hint = ""
        if(ball>0){
            hint += "${ball}${BALL}"
        }
        if(strike>0) {
            hint += "${strike}${STRIKE}"
        }

        println(hint)
    }

}