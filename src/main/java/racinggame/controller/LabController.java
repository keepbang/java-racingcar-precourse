package racinggame.controller;

import racinggame.exception.InvalidCarNameException;
import racinggame.model.Lab;

import static racinggame.view.ConsoleView.enterLab;
import static racinggame.view.ConsoleView.printError;

public class LabController {
    private static class LazyHolder {
        public static final LabController INSTANCE = new LabController();
    }

    public static LabController getInstance() {
        return LazyHolder.INSTANCE;
    }

    private LabController() {
    }

    public Lab inputLab() {
        try {
            Lab lab = new Lab(enterLab());
            return lab;
        } catch (InvalidCarNameException e) {
            printError(e.getMessage());
            return inputLab();
        }
    }
}
