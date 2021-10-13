package racinggame.view;

import racinggame.model.Car;
import racinggame.model.Position;
import racinggame.model.RacingGame;
import nextstep.utils.Console;

import java.util.List;

public class ConsoleView {

    private static final String INPUT_CAR_TEXT = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String INPUT_LAB_TEXT = "시도할 회수는 몇회인가요?";
    private static final String PLAY_RESULT = "실행 결과";
    private static final String DASH = "-";
    private static final String FINAL_WINNER_TEXT = "최종 우승자는 %s 입니다.\n";

    private ConsoleView(){}

    public static String enterCarNames(){
        System.out.println(INPUT_CAR_TEXT);
        return Console.readLine();
    }

    public static String enterLab(){
        System.out.println(INPUT_LAB_TEXT);
        return Console.readLine();
    }

    public static void playResult(){
        System.out.println(System.lineSeparator() + PLAY_RESULT);
    }

    public static void finishOneLabResult(RacingGame racingGame){
        List<Car> cars = racingGame.getRacingCars().getCars();
        for (Car car : cars) {
            printLabResult(car);
        }
        System.out.println();
    }

    private static void printLabResult(Car car){
        System.out.println(car.getCarName().getName() + " : " + printPositionDash(car.getCarPosition()));
    }

    private static String printPositionDash(Position carPosition){
        String positionDash = "";
        int position = carPosition.getPosition();
        for (int i = 0; i < position; i++) {
            positionDash += DASH;
        }
        return positionDash;
    }

    public static void printWinner(String winnerString){
        System.out.printf(FINAL_WINNER_TEXT,winnerString);
    }

    public static void printError(String errorMessage){
        System.out.println("[ERROR] " + errorMessage);
    }
}
