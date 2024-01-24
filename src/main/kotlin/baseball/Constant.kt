package baseball

class Constant {
    companion object {
        const val START_GAME = "숫자 야구 게임을 시작합니다."
        const val USER_INPUT = "숫자를 입력해주세요 : "
        const val SUCCESS_GAME = "3개의 숫자를 모두 맞히셨습니다! 게임 종료"
        const val RESTART_GAME = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요: "

        const val NOTHING = "낫싱"
        const val STRIKE = "스트라이크"
        const val BALL = "볼"

        const val INPUT_NOT_NUMBER = "입력값이 문자입니다."
        const val INPUT_LENGTH_ERROR = "입력값의 길이가 잘못되었습니다."
        const val INPUT_VALUE_ERROR = "입력한 숫자가 올바르지 않습니다."
        const val INPUT_DUPLICATE_ERROR = "중복된 숫자입니다."
    }
}