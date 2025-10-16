package calculator

fun main() {

    // 입력 문구 출력
    println(OutputView().printInputMessage())

    // 출력 문구 출력
    print(OutputView().printResultMessage())

    // 핵심 로직 출력
    println(Calculator().calculateNumbers(InputValidator().validateDelimiterAndNumber(InputView().readStringInput())))

}
