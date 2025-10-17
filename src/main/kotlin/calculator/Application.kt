package calculator

fun main() {

    // 입력 문구 출력
    OutputView().printInputMessage()

    // 입력 변수
    val input = InputView().readStringInput()
    // 검증된 깨끗한 입력 변수
    val cleanInput = InputValidator().validateDelimiterAndNumber(input)
    // 계산 로직
    val result = Calculator().calculateNumbers(cleanInput).toString()

    // 결과 출력
    OutputView().printResultMessage(result)

}
