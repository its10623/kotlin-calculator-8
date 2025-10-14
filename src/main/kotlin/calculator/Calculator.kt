package calculator

class Calculator {

    fun splitInput(input: String): String {


        val splitNumbers = input.split(",", ":").toString()

        return splitNumbers

    }

}