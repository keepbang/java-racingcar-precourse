package utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class StringUtilsTest {

    @ParameterizedTest
    @CsvSource(value = {
            "bang,aaa,Q,abcde|4",
            "A, |1"
    }, delimiter = '|')
    @DisplayName("입력받은 자동차 이름 문자열 나누기 - 성공")
    void splitCarNameTest_ok(String carNames, int length){
        assertThat(StringUtils.splitCarName(carNames).length).isEqualTo(length);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "",
            "A, |1"
    }, delimiter = '|')
    @DisplayName("입력받은 자동차 이름 문자열 나누기 - 실패")
    void splitCarNameTest_fail(String carNames, int length){
        assertThat(StringUtils.splitCarName(carNames).length).isEqualTo(length);
    }


}
