package baseball

import baseball.model.BaseBallGame
import baseball.view.InputView
import baseball.view.OutputView

fun main() {
    val inputView = InputView()
    val outputView = OutputView()
    val baseBallGame = BaseBallGame(inputView, outputView)

    baseBallGame.start()
}
