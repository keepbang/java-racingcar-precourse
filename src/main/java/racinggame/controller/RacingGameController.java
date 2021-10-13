package racinggame.controller;

import racinggame.model.Lab;
import racinggame.model.MoveStrategy;
import racinggame.model.RacingCars;
import racinggame.model.RacingGame;
import racinggame.impl.RandomMoveImpl;

import static racinggame.view.ConsoleView.*;

public class RacingGameController {

    private final MoveStrategy moveStrategy;

    private static class LazyHolder {
        public static final RacingGameController INSTANCE = new RacingGameController();
    }

    public static RacingGameController getInstance() {
        return LazyHolder.INSTANCE;
    }

    private RacingGameController() {
        moveStrategy = RandomMoveImpl.getInstance();
    }

    public RacingGame play(RacingCars racingCars, Lab lab){
        RacingGame racingGame = new RacingGame(racingCars, lab);
        playResult();
        while(racingGame.getLab().getLabCount() > 0){
            racingGame.startCars(moveStrategy);
            finishOneLabResult(racingGame);
        }
        return racingGame;
    }

    public void getWinner(RacingGame racingGame){
        String winnerString = racingGame.getRacingCars().getWinner();
        printWinner(winnerString);
    }
}
