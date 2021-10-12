package controller;

import model.RacingGame;

public class RacingGameExecution {

    public void run(){
        RacingGameController gameController = RacingGameController.getInstance();
        RacingGame racingGame = gameController.inputRacingGame();
        gameController.play(racingGame);
        gameController.getWinner(racingGame);
    }


}
