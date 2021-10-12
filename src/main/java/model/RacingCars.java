package model;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class RacingCars {
    public static final String SPLIT_REGEX = "\\s*,\\s*";

    private List<Car> cars;

    public RacingCars(String inputCarNames) {
        String[] carNames = splitCarName(inputCarNames);

        List<Car> inputCars = new ArrayList<>();
        for (String carName : carNames) {
            inputCars.add(new Car(carName));
        }
        this.cars = inputCars;
    }

    private String[] splitCarName(String carNames) {
        return carNames.split(SPLIT_REGEX);
    }

    public void start(MoveStrategy moveStrategy) {
        for (Car car : cars) {
            car.move(moveStrategy.move());
        }
    }

    private int maxPosition() {
        int maxPosition = 0;
        for (Car car : cars) {
            maxPosition = Math.max(maxPosition, car.getCarPosition().getPosition());
        }
        return maxPosition;
    }

    private StringJoiner getWinnerName(Car car, int maxPosition){
        StringJoiner joiner = new StringJoiner(",");
        if(car.isWinner(maxPosition)){
            joiner.add(car.getCarName().getName());
        }
        return joiner;
    }

    public String getWinner(){
        int maxPosition = maxPosition();
        StringJoiner joiner = new StringJoiner(",");
        for (Car car : cars) {
            joiner.merge(getWinnerName(car, maxPosition));
        }
        return joiner.toString();
    }

    public List<Car> getCars() {
        return cars;
    }
}
