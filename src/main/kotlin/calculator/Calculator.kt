package calculator

class Calculator {

    fun splitInput(input: String): String {


        val splitNumbers = input.split(",", ":").toString()

        return splitNumbers

    }

    fun splitCustomDelimiter(input: String): String {

        val customDelimiterStartRange = input.substring(0..1)
        val customDelimiterEndRange = input.substring(3..4)
        val customDelimiter = input.substring(2 until 3)
        val numberPart = input.substring(5)


        if (customDelimiterStartRange == CalculatorConstants.CUSTOM_DELIMITER_START) {

            if (customDelimiterEndRange == CalculatorConstants.CUSTOM_DELIMITER_END) {

                CalculatorConstants.CUSTOM_DELIMITER_RESULT = numberPart.split("${customDelimiter}").toString()

            }

        }

        return CalculatorConstants.CUSTOM_DELIMITER_RESULT

    }

}