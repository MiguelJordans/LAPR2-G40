package app.ui.console;

import app.controller.TestTypeController;
import app.domain.TestTypeStore;
import app.ui.console.utils.Utils;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class TestTypeUI implements Runnable {

    private TestTypeController ctrl;
    private TestTypeStore ttStore;

    public TestTypeUI() {
        this.ctrl = new TestTypeController();
    }

    @Override
    public void run() {
        boolean cont = true;
        boolean exception = false;
        do {
            try {
                String collectingMethod = Utils.readLineFromConsole("Please enter the collecting method for the Test Type");
                String description = Utils.readLineFromConsole("Please enter the description of the test type");
                String testCode = Utils.readLineFromConsole("Please enter the testCode of the Test Type");
                ctrl.CreateTestType(description, testCode, collectingMethod);
                exception = false;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Incorrect input of data (an error has occurred), please try again.");
                exception = true;
            }
        } while (exception);

        cont = Utils.confirm("Test Type created! Do you wish to save it?" + ctrl.getTT());
        if (cont) {
            if (ctrl.saveTestType()) {
                System.out.println("Test type was saved with success!");
            }
        }
    }
}