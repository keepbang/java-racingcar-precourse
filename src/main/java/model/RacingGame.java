package model;

public class RacingGame {

    private RacingCars racingCars;
    private Lab lab;

    public RacingGame(RacingCars racingCars, Lab lab) {
        this.racingCars = racingCars;
        this.lab = lab;
    }

    public Lab getLab() {
        return this.lab;
    }

    public RacingCars getRacingCars() {
        return racingCars;
    }

    public void startCars(MoveStrategy moveStrategy) {
        racingCars.start(moveStrategy);
        lab.finishOneLab();
    }
}
