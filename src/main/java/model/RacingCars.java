package model;

import java.util.ArrayList;
import java.util.List;

public class RacingCars {
    public static final String SPLIT_REGEX = "\\s*,\\s*";

    private List<Car> cars;

    public RacingCars(String inputCarNames){
        String[] carNames = splitCarName(inputCarNames);

        List<Car> inputCars = new ArrayList<>();
        for (String carName : carNames) {
            inputCars.add(new Car(carName));
        }
        this.cars = inputCars;
    }

    private static String[] splitCarName(String carNames) {
        return carNames.split(SPLIT_REGEX);
    }

    public void start(MoveStrategy moveStrategy){
        for (Car car : cars) {
            car.move(moveStrategy.move());
        }
    }

    public List<Car> getCars() {
        return cars;
    }
}
