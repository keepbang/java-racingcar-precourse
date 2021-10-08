package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static view.ExceptionMessage.ERROR_VALID_NAME_TEXT;

class NameTest {

    @ParameterizedTest
    @ValueSource(strings = {"A", "ba", "bang", "THING"})
    @DisplayName("이름 생성 테스트 - 성공")
    void createNameTest_ok(String input){
        Name name = new Name(input);
        assertThat(name.getName()).isEqualTo(input);
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "bangki"})
    @DisplayName("이름 생성 테스트 - 실패")
    void createNameTest_fail(String input){
        assertThatIllegalArgumentException().isThrownBy(() -> new Name(input))
                .withMessageMatching(ERROR_VALID_NAME_TEXT);
    }


}