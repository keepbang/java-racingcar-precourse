package model;

import exception.InvalidLabException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class LabTest {

    @ParameterizedTest
    @CsvSource(value = {
            "1,1", "99,99", "900,900"
    }, delimiter = ',')
    @DisplayName("시도할 회수는 1이상의 숫자만 입력 받음")
    void createLabTest_success(String input, int labNumber) {
        assertThat(new Lab(input).getLabCount()).isEqualTo(labNumber);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "lab", "-1", "0"
    })
    @DisplayName("문자나 음수, 0은 입력받지 못함")
    void createLabTest_fail(String input) {
        assertThatThrownBy(() -> new Lab(input)).isInstanceOf(InvalidLabException.class);
    }

}