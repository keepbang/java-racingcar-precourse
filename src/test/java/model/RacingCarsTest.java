package model;

import exception.InvalidCarNameException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class RacingCarsTest {

    @ParameterizedTest
    @ValueSource(strings = {
            "bang", "bang,chae,kim"
    })
    @DisplayName("자동차 이름 입력 테스트 - 성공")
    void inputRacingCarNamesTest_success(String inputNames){
        assertThat(new RacingCars(inputNames)).isInstanceOf(RacingCars.class);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "", "bang,kimaaa",",bang"
    })
    @DisplayName("자동차 이름 입력 테스트 - 실패")
    void inputRacingCarNamesTest_fail(String inputNames){
        assertThatThrownBy(() -> new RacingCars(inputNames)).isInstanceOf(InvalidCarNameException.class);
    }

    @Test
    @DisplayName("레이싱카 전진 테스트")
    void racingCarMoveStartTest(){
        RacingCars racingCars = new RacingCars("bang,chae,kim");
        racingCars.start(() -> true);
        List<Car> cars = racingCars.getCars();
        for (Car car : cars) {
            assertThat(car.getCarPosition().getPosition()).isEqualTo(1);
        }
    }

    @Test
    @DisplayName("레이싱카 정지 테스트")
    void racingCarMoveStopTest(){
        RacingCars racingCars = new RacingCars("bang,chae,kim");
        racingCars.start(() -> false);
        List<Car> cars = racingCars.getCars();
        for (Car car : cars) {
            assertThat(car.getCarPosition().getPosition()).isEqualTo(0);
        }
    }

}