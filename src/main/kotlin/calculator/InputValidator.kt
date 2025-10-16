package calculator

class InputValidator {

    fun validateDelimiterAndNumber(input: String): String {

        for (char in input) {

            if (validateCustomDelimiterStart(input)) {

                if (char != '/' && char != '\\' && char != 'n' && char.digitToIntOrNull() == null
                    && char != Calculator().splitCustomDelimiter(input).first()) {

                    throw IllegalArgumentException(CalculatorConstants.ERROR_INVALID_INPUT)

                }

            } else {

                if (char != CalculatorConstants.DELIMITER_FIRST
                    && char != CalculatorConstants.DELIMITER_SECOND
                    && char.digitToIntOrNull() == null) {

                    throw IllegalArgumentException(CalculatorConstants.ERROR_INVALID_INPUT)

                }
            }
        }

        return input

    }

    fun validateCustomDelimiterStart(input: String): Boolean {

        val validationCustomDelimiterStart = input.startsWith(CalculatorConstants.CUSTOM_DELIMITER_START)

        if (validationCustomDelimiterStart) { return true }

        return false

    }

}