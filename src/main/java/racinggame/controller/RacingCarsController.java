package racinggame.controller;

import racinggame.exception.InvalidCarNameException;
import racinggame.model.RacingCars;

import static racinggame.view.ConsoleView.enterCarNames;
import static racinggame.view.ConsoleView.printError;

public class RacingCarsController {
    private static class LazyHolder {
        public static final RacingCarsController INSTANCE = new RacingCarsController();
    }

    public static RacingCarsController getInstance() {
        return LazyHolder.INSTANCE;
    }

    private RacingCarsController() {
    }

    public RacingCars inputCarNames() {
        try{
            RacingCars racingCars = new RacingCars(enterCarNames());
            return racingCars;
        }catch(InvalidCarNameException e){
            printError(e.getMessage());
            return inputCarNames();
        }
    }
}
