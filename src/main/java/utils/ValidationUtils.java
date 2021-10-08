package utils;

public class ValidationUtils {

    public static final int CAR_NAME_MAX_LENGTH = 5;
    public static final int CAR_NAME_MIN_LENGTH = 0;

    public static boolean validCarNameLength(String carName) {
        return CAR_NAME_MIN_LENGTH < carName.length() &&
                carName.length() <= CAR_NAME_MAX_LENGTH;
    }
}
