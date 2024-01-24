package baseball.enums

enum class BaseballGameNumber(val number: Int) {
    ZERO(0),

    RESTART_INPUT(1),
    END_INPUT(2),

    NUMBER_RANGE_START(1),
    NUMBER_RANGE_END(9),

    REQUIRED_NUMBER_SIZE(3),
    MAX_ALLOWED_STRIKES(3)
}