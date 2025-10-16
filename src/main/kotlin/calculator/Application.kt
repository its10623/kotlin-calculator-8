package calculator

fun main() {

    println(OutputView().printInputMessage())

    print(OutputView().printResultMessage())

    println(Calculator().calculateNumbers(InputValidator().validateDelimiterAndNumber(InputView().readStringInput())))

}
