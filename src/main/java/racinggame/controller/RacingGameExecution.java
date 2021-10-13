package racinggame.controller;

import racinggame.model.RacingGame;

public class RacingGameExecution {

    private final RacingGameController gameController;

    public RacingGameExecution(){
        this.gameController = RacingGameController.getInstance();
    }

    public void run(){
        RacingGame racingGame = gameController.inputRacingGame();
        gameController.play(racingGame);
        gameController.getWinner(racingGame);
    }


}
