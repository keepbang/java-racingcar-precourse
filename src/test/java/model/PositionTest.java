package model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racinggame.model.Position;

class PositionTest {

    @Test
    @DisplayName("전진 테스트")
    void positionMoveStartTest(){
        Position position = new Position();
        position.move(true);
        Assertions.assertThat(position.getPosition()).isEqualTo(1);
    }

    @Test
    @DisplayName("정지 테스트")
    void positionMoveStopTest(){
        Position position = new Position();
        position.move(false);
        Assertions.assertThat(position.getPosition()).isEqualTo(0);
    }

}