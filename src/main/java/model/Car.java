package model;

public class Car {
    private Name carName;
    private Position position;

    public Car(String carName){
        this.carName = new Name(carName);
        this.position = new Position();
    }

    public Name getCarName() {
        return carName;
    }

    public Position getCarPosition(){
        return this.position;
    }

    public void move(boolean movable){
        position.move(movable);
    }
}
