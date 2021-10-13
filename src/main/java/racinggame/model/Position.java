package racinggame.model;

public class Position {
    private int position;

    public Position(){
        this.position = 0;
    }

    public int getPosition() {
        return this.position;
    }

    public void move(boolean movable){
        if(movable){
            this.position++;
        }
    }
}
