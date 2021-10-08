package utils;

public class StringUtils {

    public static final String SPLIT_REGEX = "\\s*,\\s*";

    public static String[] splitCarName(String carNames) {
        return carNames.split(SPLIT_REGEX);
    }
}
