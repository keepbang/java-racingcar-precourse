package racinggame.impl;

import racinggame.model.MoveStrategy;
import util.RandomNumberGenerator;

public class RandomMoveImpl implements MoveStrategy {

    private final static int MOVABLE = 4;
    private final RandomNumberGenerator randomNumberGenerator;

    private static class LazyHolder {
        public static final RandomMoveImpl INSTANCE = new RandomMoveImpl();
    }

    public static RandomMoveImpl getInstance() {
        return LazyHolder.INSTANCE;
    }

    private RandomMoveImpl(){
        randomNumberGenerator = RandomNumberGenerator.getInstance();
    }

    @Override
    public boolean move() {
        return randomNumberGenerator.getRandomNumber() >= MOVABLE;
    }
}
