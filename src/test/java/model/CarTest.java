package model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    @DisplayName("자동차 이동 전진 테스트")
    void carMoveStartTest(){
        Car car = new Car("bang");

        car.move(true);
        car.move(true);
        car.move(true);

        Assertions.assertThat(car.getCarPosition().getPosition()).isEqualTo(3);
    }

    @Test
    @DisplayName("자동차 이동 정지 테스트")
    void carMoveStopTest(){
        Car car = new Car("bang");

        car.move(true);
        car.move(false);
        car.move(false);

        Assertions.assertThat(car.getCarPosition().getPosition()).isEqualTo(1);
    }
}