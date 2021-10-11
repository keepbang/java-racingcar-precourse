package controller;

public class RacingGameExecution {
    private final RacingGameController racingGameController;


    public RacingGameExecution(){
        this.racingGameController = new RacingGameController();
    }

    public void run(){
        racingGameController.play();
    }


}
