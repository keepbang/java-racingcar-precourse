package model;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private List<Car> cars;

    public Cars(String[] carNames){
        List<Car> inputCars = new ArrayList<>();
        for (String carName : carNames) {
            inputCars.add(new Car(carName));
        }
        this.cars = inputCars;
    }

}
