package calculator

class InputValidator {

    // 핵심 검증 함수
    fun validateDelimiterAndNumber(input: String): String {

        // 입력받은 문자열을 순회
        for (char in input) {

            if (hasCustomDelimiterStart(input)) {

                // 커스텀 구분자 일 경우 문자가 '/', '\', 'n', 숫자, 커스텀 구분자가 아닐 경우
                // 예외를 던지며 예외 문구 출력하고 어플리케이션 종료
                if (char != '/' && char != '\\' && char != 'n' && char.digitToIntOrNull() == null
                    && char != Calculator().splitCustomDelimiter(input).first()) {

                    throw IllegalArgumentException(CalculatorConstants.ERROR_INVALID_INPUT)

                }

            } else {

                // 커스텀 구분자 아닐 경우 문자가 숫자와 기본 구분자가 아니면
                // 예외를 던지며 예외 문구 출력하고 어플리케이션 종료
                if (char != CalculatorConstants.DELIMITER_FIRST
                    && char != CalculatorConstants.DELIMITER_SECOND
                    && char.digitToIntOrNull() == null) {

                    throw IllegalArgumentException(CalculatorConstants.ERROR_INVALID_INPUT)

                }
            }
        }

        return input

    }

    // 커스텀 구분자를 지정하는지 확인하는 함수
    fun hasCustomDelimiterStart(input: String): Boolean {

        // 입력 문자열이 "//"로 시작하는지 확인
        // "//" 로 시작하면 커스텀 구분자를 지정하기 때문에 true 반환 아닐 경우 false 반환
        val validationCustomDelimiterStart = input.startsWith(CalculatorConstants.CUSTOM_DELIMITER_START)

        return validationCustomDelimiterStart
    }

}