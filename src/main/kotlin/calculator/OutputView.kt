package calculator

class OutputView {

    // 입력 문구 기능 구현
    fun printInputMessage() {

        println(CalculatorConstants.INPUT_MESSAGE)

    }

    // 출력 결과 문구 기능 구현
    fun printResultMessage(result: String) {

        val outputMessage = CalculatorConstants.RESULT_OUTPUT_MESSAGE

        println("${outputMessage}${result}")

    }

}