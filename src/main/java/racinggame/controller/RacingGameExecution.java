package racinggame.controller;

import racinggame.model.Lab;
import racinggame.model.RacingCars;
import racinggame.model.RacingGame;

public class RacingGameExecution {

    private final RacingGameController gameController;
    private final RacingCarsController racingCarsController;
    private final LabController labController;

    public RacingGameExecution(){
        this.gameController = RacingGameController.getInstance();
        this.racingCarsController = RacingCarsController.getInstance();
        this.labController = LabController.getInstance();
    }

    public void run(){
        RacingCars racingCars = racingCarsController.inputCarNames();
        Lab lab = labController.inputLab();
        RacingGame racingGame = gameController.play(racingCars, lab);
        gameController.getWinner(racingGame);
    }


}
