package calculator

class InputValidator {

    // 핵심 검증 함수
    fun validateDelimiterAndNumber(input: String): String {

        // 입력받은 문자열을 순회
        for (char in input) {

            // 커스텀 구분자를 지정했으면 true 지정하지 않았다면 false
            if (Calculator().hasCustomDelimiter(input)) {

                // 커스텀 구분자 일 경우 문자가 '/', '\', 'n', 숫자, 커스텀 구분자가 아닐 경우
                // 예외를 던지며 예외 문구 출력하고 어플리케이션 종료
                if (char != '/' && char != '\\' && char != 'n' && char.digitToIntOrNull() == null
                    && char != Calculator().getCustomDelimiter(input).first() ) {

                    throw IllegalArgumentException(CalculatorConstants.ERROR_INVALID_INPUT_MESSAGE)

                }

            } else {

                // 순회하는 문자가 숫자와 기본 구분자가 아니면
                // 예외를 던지며 예외 문구 출력하고 어플리케이션 종료
                if (char != CalculatorConstants.DEFAULT_DELIMITER_PREFIX &&
                    char != CalculatorConstants.DEFAULT_DELIMITER_POSTFIX && char.digitToIntOrNull() == null) {

                    throw IllegalArgumentException(CalculatorConstants.ERROR_INVALID_INPUT_MESSAGE)

                }
            }
        }

        return input

    }

}