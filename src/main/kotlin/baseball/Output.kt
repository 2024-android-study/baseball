package baseball

import baseball.Constant.Companion.BALL
import baseball.Constant.Companion.CORRECT
import baseball.Constant.Companion.NOTHING
import baseball.Constant.Companion.RESTART_OR_END
import baseball.Constant.Companion.START
import baseball.Constant.Companion.STRIKE

class Output {
    fun printStart() {
        println(START)
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
            if(ball>0) hint += " "
            hint += "${strike}${STRIKE}"
        }

        println(hint)
    }

    fun printCorrectAndEnd() {
        println(CORRECT)
        println(RESTART_OR_END)
    }
}