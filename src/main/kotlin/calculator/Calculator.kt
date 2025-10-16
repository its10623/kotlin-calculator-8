package calculator

class Calculator {

    fun calculateNumbers(input: String): Int {

        val numberStrings = getNumbersAsString(input)
        var resultNumber = CalculatorConstants.RESULT_NUMBER

        for (char in numberStrings.toString()) {

            val digit = char.digitToInt()

            resultNumber += digit

        }

        return resultNumber

    }

    fun getNumbersAsString(input: String): Int {

        val numbersStrings = input.replace(Regex(CalculatorConstants.REPLACE_REGEX_PATTERN), "").toIntOrNull()!!

        return numbersStrings

    }

    fun splitCustomDelimiter(input: String): String {

        val customDelimiter = input[CalculatorConstants.CUSTOM_DELIMITER_INDEX].toString()

        return customDelimiter

    }

}