package calculator

import camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest
import camp.nextstep.edu.missionutils.test.NsTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class ApplicationTest : NsTest() {
    @Test
    fun `커스텀 구분자 사용`() {
        assertSimpleTest {
            run("//;\\n1")
            assertThat(output()).contains("결과 : 1")
        }
    }

    @Test
    fun `예외 테스트`() {

        assertThrows<IllegalArgumentException> { runException("-1,2;3") }
    }

    @Test
    fun `다른 문자가 입력되는 예외 테스트`() {
        assertThrows<IllegalArgumentException> { runException("1,a,3")}
    }

    @Test
    fun `커스텀 종료 문자가 없는 경우`() {
        assertThrows<IllegalArgumentException> { runException(("//;1;2;3"))  }
    }


    @Test
    fun `빈 문자열 입력 됐을 때`() {
        assertSimpleTest {
            run("\n")
            assertThat(output()).contains("결과 : 0")
        }
    }

    @Test
    fun `기본 구분자 사용`() {
        assertSimpleTest {
            run("1,2:3")
            assertThat(output()).contains("결과 : 6")
        }
    }

    @Test
    fun `10이상의 숫자가 입력됐을 때`() {
        assertSimpleTest {
            run("102,24:30")
            assertThat(output()).contains("결과 : 156")
        }
    }

    @Test
    fun `구분자만 입력됐을 때`() {
        assertSimpleTest {
            run("//;\\n;")
            assertThat(output()).contains("결과 : 0")
        }
    }

    @Test
    fun `숫자만 입력됐을 때`() {
        assertSimpleTest {
            run("5")
            assertThat(output()).contains("결과 : 5")
        }
    }


    override fun runMain() {
        main()
    }
}

