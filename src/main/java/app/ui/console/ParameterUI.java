package app.ui.console;

import app.controller.ParameterController;
import app.controller.TestTypeController;
import app.ui.console.utils.Utils;

public class ParameterUI implements Runnable {

        private ParameterController ctrl;

        public ParameterUI() {
            this.ctrl = new ParameterController();
        }

        @Override
        public void run() {
            boolean cont = true;
            boolean exception = false;
            do {
                try {
                    String name = Utils.readLineFromConsole("Please enter the name of the parameter");
                    String description = Utils.readLineFromConsole("Please enter the description of the parameter");
                    String code = Utils.readLineFromConsole("Please enter the code of the parameter");
                    ctrl.CreateParameter(description, code, name);
                    exception = false;
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Incorrect input of data (an error has ocurred), please try again.");
                    exception = true;
                }
            } while (exception);

            cont = Utils.confirm("Parameter created! Do you wish to save it?" + ctrl.getPP());
            if (cont) {
                if (ctrl.saveTestType()) ;
                System.out.println("Parameter was saved with sucess!");
            }
        }
    }