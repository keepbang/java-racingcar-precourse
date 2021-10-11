package model;

public class Car {
    private Name carName;
    private Position position;

    public Car(String carName){
        this.carName = new Name(carName);
        this.position = new Position(0);
    }
}
