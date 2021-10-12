package controller;

import exception.InvalidCarNameException;
import model.Lab;
import model.MoveStrategy;
import model.RacingCars;
import model.RacingGame;
import impl.RandomMoveImpl;

import static view.ConsoleView.*;

public class RacingGameController {

    private final RacingGame racingGame;
    private final MoveStrategy moveStrategy = RandomMoveImpl.getInstance();

    private static class LazyHolder {
        public static final RacingGameController INSTANCE = new RacingGameController();
    }

    public static RacingGameController getInstance() {
        return LazyHolder.INSTANCE;
    }

    private RacingGameController() {
        racingGame = new RacingGame();
        inputCarNames();
        inputLab();
    }

    public void play(){
        playResult();
        while(racingGame.getLab().getLabCount() > 0){
            racingGame.startCars(moveStrategy);
            finishOneLabResult(racingGame);
        }
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
