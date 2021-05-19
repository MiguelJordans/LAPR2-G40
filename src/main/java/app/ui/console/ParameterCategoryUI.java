package app.ui.console;

import app.controller.ParameterCategoryController;
import app.controller.ParameterController;
import app.controller.TestTypeController;
import app.domain.model.ParameterCategory;
import app.ui.console.utils.Utils;

public class ParameterCategoryUI implements Runnable {

    private ParameterCategoryController ctrl;

    public ParameterCategoryUI() {
        this.ctrl = new ParameterCategoryController();
    }

    @Override
    public void run() {
        boolean cont = true;
        boolean exception = false;
        do {
            try {
                String nhsld = Utils.readLineFromConsole("Please enter the nhsld of the parameter category");
                String description = Utils.readLineFromConsole("Please enter the description of the parameter category");
                String code = Utils.readLineFromConsole("Please enter the code of the parameter category");
                ctrl.CreateParameterCategory(description, code, nhsld);
                exception = false;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Incorrect input of data (an error has ocurred), please try again.");
                exception = true;
            }
        } while (exception);

        cont = Utils.confirm("Parameter Category created! Do you wish to save it?" + ctrl.getPC());
        if (cont) {
            if (ctrl.saveParameterCategory()) ;
            System.out.println("Parameter Category was saved with sucess!");
        }
    }
}