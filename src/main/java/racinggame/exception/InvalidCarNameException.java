package racinggame.exception;

public class InvalidCarNameException extends IllegalArgumentException{
    private static final String ERROR_VALID_NAME_TEXT = "자동차 이름은 1자리 이상 5자리 이하로 입력해주십시오.";

    public InvalidCarNameException(){
        super(ERROR_VALID_NAME_TEXT);
    }
}
