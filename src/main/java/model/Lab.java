package model;

import exception.InvalidLabException;

public class Lab {
    public static final String IS_NUMBER_REGEX = "[0-9]+";
    public static final int MIN_LAB_NUMBER = 0;

    private int labCount;

    public Lab(String labCount){
        validLab(labCount);
        this.labCount = Integer.parseInt(labCount);
    }

    private void validLab(String labCount) {
        if(!validLabNumber(labCount)){
            throw new InvalidLabException();
        }
    }

    private boolean validLabNumber(String labCount){
        return labCount.matches(IS_NUMBER_REGEX)
                && Integer.parseInt(labCount) > MIN_LAB_NUMBER;
    }

    public int getLabCount() {
        return labCount;
    }

    public void finishOneLab(){
        this.labCount--;
    }
}
