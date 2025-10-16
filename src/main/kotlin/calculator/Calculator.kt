package calculator

class Calculator {

    fun calculateNumbers (input: String): Int{

        val numberList = splitInput(input)

        var resultNumber = 0

        for (char in numberList.toString()) {

            val digit = char.digitToInt()

            resultNumber += digit

        }

        return resultNumber

    }


    fun splitInput(input: String): Int? {

        var numbersStrings = input.split(CalculatorConstants.DELIMITER_FIRST,
            CalculatorConstants.DELIMITER_SECOND).toString()
            .replace(Regex("[^\\d]"),"").toIntOrNull()

        if (hasCustomDelimiter(input)) {

            numbersStrings = specifyCustomDelimiter(input)
                .replace(Regex("[^\\d]"),"").toIntOrNull()

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

        val customDelimiterBoolean = input.startsWith(CalculatorConstants.CUSTOM_DELIMITER_START)
        
        return customDelimiterBoolean
    }

    fun specifyCustomDelimiter(input: String): String {

        val numberPart = input.substring(5)

        CalculatorConstants.CUSTOM_DELIMITER_NUMBER_RESULT = numberPart
            .split(splitCustomDelimiter(input)).toString()

        return CalculatorConstants.CUSTOM_DELIMITER_NUMBER_RESULT

    }

}