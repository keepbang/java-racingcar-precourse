package nextstep.utils;

import static nextstep.utils.Randoms.pickNumberInRange;

public class RandomNumberGenerator {

    private final static int MIN_NUMBER = 0;
    private final static int MAX_NUMBER = 9;

    private static class LazyHolder {
        public static final RandomNumberGenerator INSTANCE = new RandomNumberGenerator();
    }

    public static RandomNumberGenerator getInstance() {
        return LazyHolder.INSTANCE;
    }

    public int getRandomNumber(){
        return pickNumberInRange(MIN_NUMBER, MAX_NUMBER);
    }

}
