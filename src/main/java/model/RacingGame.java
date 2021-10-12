package model;

public class RacingGame {

    private RacingCars racingCars;
    private Lab lab;

    public void inputRacingCars(RacingCars racingCars) {
        this.racingCars = racingCars;
    }

    public void inputLab(Lab lab) {
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
