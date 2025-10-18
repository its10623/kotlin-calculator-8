package calculator

class Calculator {

    // 덧셈 계산 로직 함수
    fun calculateNumbers(input: String): Int {

        // 숫자를 합산하여 저장할 변수
        var sumNumber = 0

        // 커스텀 구분자가 맞는지 확인
        if (hasCustomDelimiter(input)) {

            sumNumber = input.split(getCustomDelimiter(input),
                "/", "\\", "n").sumOf { it.toIntOrNull() ?: 0 }

            return sumNumber

        }

        sumNumber = input.split(CalculatorConstants.DEFAULT_DELIMITER_PREFIX
            , CalculatorConstants.DEFAULT_DELIMITER_POSTFIX).sumOf { it.toIntOrNull() ?: 0}

        return sumNumber

    }

    // 커스텀 구분자를 가져올 함수
    fun getCustomDelimiter(input: String): String {
        return input[CalculatorConstants.CUSTOM_DELIMITER_INDEX].toString()
    }

    // 커스텀 구분자를 지정하는지 확인
    fun hasCustomDelimiter(input: String): Boolean {

        val customDelimiterStart = input.startsWith(CalculatorConstants.CUSTOM_DELIMITER_START)
        val customDelimiterEnd = input.contains(CalculatorConstants.CUSTOM_DELIMITER_END)

        return customDelimiterStart && customDelimiterEnd
    }
}
