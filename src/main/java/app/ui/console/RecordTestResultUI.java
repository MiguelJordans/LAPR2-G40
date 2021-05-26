package app.ui.console;

import app.controller.App;
import app.controller.RecordTestResultController;
import app.domain.model.*;
import app.ui.console.utils.Utils;

import java.util.List;

public class RecordTestResultUI implements Runnable {

    RecordTestResultController ctrl;
    TestStore testStore;

    public RecordTestResultUI() {
        ctrl = new RecordTestResultController();
        testStore = new TestStore();
    }

    @Override
    public void run() {
        boolean exception = false;
        do {
            String sampleID = Utils.readLineFromConsole("Please enter the sample barcode number of the test");

            try {
                List<Parameter> parameters = ctrl.getParameters(sampleID);
                System.out.println();
                for (Parameter param : parameters) {
                    System.out.println();
                    System.out.println("Parameters: " + param.getName());

                    double result = Utils.readDoubleFromConsole("Please insert the result/value");
                    ctrl.addTestParameterResult(param.getCode(), result);
                }
            } catch (Exception e) {
                System.out.println("Incorrect input of data (an error has occurred), please try again.");
                System.out.println(e.getMessage());
                exception = true;
            }
        } while (exception);
    }
}
