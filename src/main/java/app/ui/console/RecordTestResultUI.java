package app.ui.console;

import app.controller.RecordTestResultController;
import app.domain.model.*;
import app.ui.console.utils.Utils;

import java.util.List;

public class RecordTestResultUI implements Runnable {

    RecordTestResultController ctrl;

    public RecordTestResultUI() {
        ctrl = new RecordTestResultController();
    }

    @Override
    public void run() {

        boolean result = true, repeat = false;
        double value;

        String sampleID = Utils.readLineFromConsole("Please enter the sample barcode number of the test:");

        List<TestParameter> parameters = ctrl.getParameters(sampleID);

        do {
            for (TestParameter param : parameters) {
                System.out.println();
                System.out.print("Parameters: " + param.getParam().getName());

                value = Utils.readDoubleFromConsole("Please insert the result/value:");

                try {
                    result = ctrl.addTestParameterResult(param.getParam().getCode(), value);
                    result = true;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    result = false;
                }

                if (result) {
                    System.out.println("Test parameter result saved with success!");
                } else {
                    System.out.println("Incorrect input of data (an error has occurred).");
                    repeat = Utils.confirm("Try again? (s/n)");
                }
            }
        } while (repeat);

        if (result) {
            ctrl.setState();
            System.out.println("Success! All test parameters results have been recorded.");
        } else {
            System.out.println("Something went wrong... please, try again.");
        }
    }
}