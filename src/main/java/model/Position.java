package model;

public class Position {
    private int position;

    private Position(){};

    public Position(int position){
        this.position = position;
    }

    public int getPosition() {
        return this.position;
    }

    public Position addPosition(){
        return new Position(this.position + 1);
    }
}
