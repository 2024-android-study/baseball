package baseball.messages

class BaseballGameMessage {
    companion object {
        const val GAME_START_MESSAGE = "숫자 야구 게임을 시작합니다."
        const val GAME_END_MESSAGE = "%d개의 숫자를 모두 맞히셨습니다! 게임 종료"
        const val STRIKE_MESSAGE = "%d스트라이크"
        const val BALL_MESSAGE = "%d볼"
        const val NOTHING_MESSAGE = "낫싱"

        const val INPUT_MESSAGE = "숫자를 입력해주세요 : "
        const val ASK_RESTART_OR_END_MESSAGE = "게임을 새로 시작하려면 %d, 종료하려면 %d를 입력하세요."
    }
}