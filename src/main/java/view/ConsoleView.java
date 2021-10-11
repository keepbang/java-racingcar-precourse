package view;

import nextstep.utils.Console;

public class ConsoleView {

    private static final String INPUT_CAR_TEXT = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String INPUT_LAB_TEXT = "시도할 회수는 몇회인가요?";

    public static String enterCarNames(){
        System.out.println(INPUT_CAR_TEXT);
        return Console.readLine();
    }

    public static String enterLab(){
        System.out.println(INPUT_LAB_TEXT);
        return Console.readLine();
    }

    public static void printError(String errorMessage){
        System.out.println("[ERROR] " + errorMessage);
    }
}
