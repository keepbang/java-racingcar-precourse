package model;

public class RacingCars {
    public static final String SPLIT_REGEX = "\\s*,\\s*";

    private Cars cars;

    public RacingCars(String inputCarNames){
        this.cars = new Cars(splitCarName(inputCarNames));
    }

    private static String[] splitCarName(String carNames) {
        return carNames.split(SPLIT_REGEX);
    }
}
