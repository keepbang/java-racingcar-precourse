package racinggame.model;

import racinggame.exception.InvalidCarNameException;

public class Name{
    public static final int NAME_MAX_LENGTH = 5;
    public static final int NAME_MIN_LENGTH = 0;

    private String name;

    public Name(String name){
        validName(name);
        this.name = name;
    }

    private void validName(String name) {
        if(!validCarNameLength(name)){
            throw new InvalidCarNameException();
        }
    }

    private boolean validCarNameLength(String carName) {
        return NAME_MIN_LENGTH < carName.length() &&
                carName.length() <= NAME_MAX_LENGTH;
    }

    public String getName() {
        return this.name;
    }
}
