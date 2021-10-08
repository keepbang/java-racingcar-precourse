package model;

import static utils.ValidationUtils.validCarNameLength;
import static view.ExceptionMessage.ERROR_VALID_NAME_TEXT;

public class Name{
    private String name;

    public Name(String name){
        validName(name);
        this.name = name;
    }

    private void validName(String name) {
        if(!validCarNameLength(name)){
            throw new IllegalArgumentException(ERROR_VALID_NAME_TEXT);
        }
    }

    public String getName() {
        return this.name;
    }
}
