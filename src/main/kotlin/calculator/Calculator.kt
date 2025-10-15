package calculator

class Calculator {

    fun splitInput(input: String): String {



    fun splitInput(input: String): Int {

        var numbersStrings = input.split(",", ":").toString()
            .replace(Regex("[^\\d]"),"").toIntOrNull()!!


        if (hasCustomDelimiter(InputView().readStringInput())) {

            numbersStrings = specifyCustomDelimiter(InputView().readStringInput())
                .replace(Regex("[^\\d]"),"").toIntOrNull()!!

            return numbersStrings

        } else {

            return numbersStrings

        }

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