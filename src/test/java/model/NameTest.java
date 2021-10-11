package model;

import exception.InvalidCarNameException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

class NameTest {

    @ParameterizedTest
    @ValueSource(strings = {"A", "ba", "bang", "THING"})
    @DisplayName("1자리 이상 5자리 아하의 문자만 받을수 있음")
    void createNameTest_success(String input){
        assertThat(new Name(input).getName()).isEqualTo(input);
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "bangki"})
    @DisplayName("공백이나 5자리 이상의 문자는 받지 못함")
    void createNameTest_fail(String input){
        assertThatThrownBy(() -> new Name(input)).isInstanceOf(InvalidCarNameException.class);
    }


}