package controller;

import exception.InvalidCarNameException;
import model.Lab;
import model.MoveStrategy;
import model.RacingCars;
import model.RacingGame;
import impl.RandomMoveImpl;

import static view.ConsoleView.*;

public class RacingGameController {

    private final MoveStrategy moveStrategy = RandomMoveImpl.getInstance();

    private static class LazyHolder {
        public static final RacingGameController INSTANCE = new RacingGameController();
    }

    public static RacingGameController getInstance() {
        return LazyHolder.INSTANCE;
    }

    private RacingGameController() {}

    public RacingGame inputRacingGame(){
        RacingCars racingCars = inputCarNames();
        Lab lab = inputLab();
        return new RacingGame(racingCars, lab);
    }

    public void play(RacingGame racingGame){
        playResult();
        while(racingGame.getLab().getLabCount() > 0){
            racingGame.startCars(moveStrategy);
            finishOneLabResult(racingGame);
        }
    }

    private RacingCars inputCarNames() {
        try{
            RacingCars racingCars = new RacingCars(enterCarNames());
            return racingCars;
        }catch(InvalidCarNameException e){
            printError(e.getMessage());
            return inputCarNames();
        }
    }

    private Lab inputLab() {
        try {
            Lab lab = new Lab(enterLab());
            return lab;
        } catch (InvalidCarNameException e) {
            printError(e.getMessage());
            return inputLab();
        }
    }

}
