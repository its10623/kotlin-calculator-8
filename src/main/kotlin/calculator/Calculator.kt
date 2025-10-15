package calculator

class Calculator {

    fun calculateNumbers (input: String): Int{

        val numberList = splitInput(input)

        var resultNumber = 0
        for (char in numberList ) {

            val digit = char.digitToInt()

            resultNumber += digit

        }

        return resultNumber

    }


    fun splitInput(input: String): String {

        var numbersStrings = input.split(",", ":").toString()
            .replace(Regex("[^\\d]"),"")

        if (hasCustomDelimiter(input)) {

            numbersStrings = specifyCustomDelimiter(input)
                .replace(Regex("[^\\d]"),"")

            return numbersStrings

        } else {

            return numbersStrings

        }

    }

    fun splitCustomDelimiter(input: String): String {

        val customDelimiter = input.substring(2 until 3)

        return customDelimiter

    }

    fun hasCustomDelimiter(input: String): Boolean {

        val customDelimiterStartRange = input.substring(0..1)
        val customDelimiterEndRange = input.substring(3..4)

        if (customDelimiterStartRange == CalculatorConstants.CUSTOM_DELIMITER_START) {

            if (customDelimiterEndRange == CalculatorConstants.CUSTOM_DELIMITER_END) {

                CalculatorConstants.BOOLEAN = true

            }

        }

        return CalculatorConstants.BOOLEAN
    }

    fun specifyCustomDelimiter(input: String): String {

        val numberPart = input.substring(5)

        CalculatorConstants.CUSTOM_DELIMITER_RESULT = numberPart
            .split(splitCustomDelimiter(input)).toString()

        return CalculatorConstants.CUSTOM_DELIMITER_RESULT

    }

}