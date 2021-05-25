package app.ui.console;

import app.controller.TestValidationController;
import app.domain.model.Test;
import app.ui.console.utils.Utils;

public class TestValidationUI implements Runnable{
    private TestValidationController ctrl;

    public TestValidationUI(){
        ctrl= new TestValidationController();
    }

    @Override
    public void run() {
        System.out.println(ctrl.invalidTests());
        String testId= Utils.readLineFromConsole("Please enter the id of test to validate.");
        ctrl.validateTest(testId);
    }
}
