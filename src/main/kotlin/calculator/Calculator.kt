package calculator

class Calculator {

    // 덧셈 계산 로직 함수
    fun calculateNumbers(input: String): Int {

        // 순회할 숫자 문자열 변수
        val numberStrings = getNumbersAsString(input)

        // 덧셈 계산 후 저장할 비어 있는 변수
        var resultNumber = CalculatorConstants.RESULT_NUMBER

        // 문자열을 순회하여 각 문자를 숫자로 변환하여 합산하고 resultNumber 변수에 저장
        for (char in numberStrings) {

            val digit = char.digitToInt()

            resultNumber += digit

        }

        return resultNumber

    }

    fun getNumbersAsString(input: String): String {

        // 기본 구분자, 커스텀 구분자를 제외한 숫자만 저장할 변수
        val numbersStrings = input.replace(Regex(CalculatorConstants.REPLACE_REGEX_PATTERN), "")

        return numbersStrings

    }

    fun splitCustomDelimiter(input: String): String {

        // 커스텀 구분자를 저장할 변수
        val customDelimiter = input[CalculatorConstants.CUSTOM_DELIMITER_INDEX].toString()

        return customDelimiter

    }

}