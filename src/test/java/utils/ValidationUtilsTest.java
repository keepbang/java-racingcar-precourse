package utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

public class ValidationUtilsTest {

    @ParameterizedTest
    @DisplayName("자동차 이름 유효성 검사 - 성공")
    void carNameValidation_ok(){
        Assertions.assertThat(ValidationUtils.validCarNameLength("kbang")).isTrue();
    }

    @Test
    @DisplayName("자동차 이름 유효성 검사 - 실")
    void carNameValidation_fail(){
        Assertions.assertThat(ValidationUtils.validCarNameLength("kebang")).isFalse();
    }
}
