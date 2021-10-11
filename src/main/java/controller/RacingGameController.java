package controller;

import exception.InvalidCarNameException;
import model.Lab;
import model.RacingCars;
import model.RacingGame;

import static view.ConsoleView.*;

public class RacingGameController {

    private final RacingGame racingGame;

    public RacingGameController() {
        racingGame = new RacingGame();
        inputCarNames();
        inputLab();
    }

    public void play(){
        racingGame.play();
    }

    private void inputCarNames() {
        boolean isValid = false;
        while (!isValid) {
            isValid = enrollRacingCars(enterCarNames());
        }
    }

    private boolean enrollRacingCars(String inputCarNames) {
        try {
            racingGame.inputRacingCars(new RacingCars(inputCarNames));
            return true;
        } catch (InvalidCarNameException e) {
            printError(e.getMessage());
        }
        return false;
    }

    private void inputLab() {
        boolean isValid = false;
        while (!isValid) {
            isValid = enrollLab(enterLab());
        }
    }

    private boolean enrollLab(String lab) {
        try {
            racingGame.inputLab(new Lab(lab));
            return true;
        } catch (InvalidCarNameException e) {
            printError(e.getMessage());
        }
        return false;
    }

}
