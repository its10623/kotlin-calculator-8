package calculator

object CalculatorConstants {
    // 상수를 관리하는 object 싱글턴 객체

    const val INPUT = "덧셈할 문자열을 입력해 주세요."
    const val RESULT_OUTPUT = "결과 : "
    const val CUSTOM_DELIMITER_START = "//"
    const val CUSTOM_DELIMITER_END = """\n"""

    const val ERROR_INVALID_INPUT = "1 이상의 숫자와 구분자만 입력해 주세요."

    var CUSTOM_DELIMITER_RESULT = ""

}