package racinggame.controller;

import racinggame.exception.InvalidCarNameException;
import racinggame.model.Lab;
import racinggame.model.MoveStrategy;
import racinggame.model.RacingCars;
import racinggame.model.RacingGame;
import racinggame.impl.RandomMoveImpl;

import static racinggame.view.ConsoleView.*;

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

    public void getWinner(RacingGame racingGame){
        String winnerString = racingGame.getRacingCars().getWinner();
        printWinner(winnerString);
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
