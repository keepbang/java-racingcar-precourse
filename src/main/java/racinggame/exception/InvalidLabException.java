package racinggame.exception;

public class InvalidLabException extends IllegalArgumentException{
    private static final String ERROR_VALID_NAME_TEXT = "시도할 회수는 1이상의 숫자만 가능합니다.";

    public InvalidLabException(){
        super(ERROR_VALID_NAME_TEXT);
    }
}
