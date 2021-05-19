package app.ui.console;

import app.controller.ParameterController;
import app.controller.TestTypeController;
import app.domain.model.ParameterCategory;
import app.domain.model.ParameterCategoryStore;
import app.domain.model.ParameterStore;
import app.ui.console.utils.Utils;

public class ParameterUI implements Runnable {

    private ParameterController ctrl;
    private ParameterCategoryStore pcStore;

    public ParameterUI() {
        this.ctrl = new ParameterController();
        this.pcStore = new ParameterCategoryStore();
    }

    @Override
    public void run() {

        boolean count = true;


        if (this.pcStore.getParameterCategoryList() == null || this.pcStore.getParameterCategoryList().isEmpty()) {
            System.out.println("The list is empty! Please, try adding at least one parameter in order to create the laboratory.");
        } else {
            do {
                boolean exception = false;

                ParameterCategory pc = (ParameterCategory) Utils.showAndSelectOne(this.pcStore.getParameterCategoryList(), "Select the category");
                this.pcStore.listAdd();

                do {
                    try {

                        String code = Utils.readLineFromConsole("Please enter the code of the Parameter");
                        String description = Utils.readLineFromConsole("Please enter the description of the Parameter");
                        String nhsld = Utils.readLineFromConsole("Please enter the nhsld of the Parameter");

                        ParameterCategoryStore pc1 = pcStore;
                        ctrl.CreateParameter(description, code, nhsld, pc1);

                        exception = false;

                    } catch (Exception e) {

                        e.printStackTrace();
                        System.out.println("Incorrect input of data (an error has occurred), please try again.");
                        exception = true;

                    }
                } while (exception);

                count = Utils.confirm("Parameter created! Do you wish to save it?" + ctrl.getPP());

                if (count) {

                    if (this.ctrl.saveParameter()) {
                        System.out.println("Parameter was saved with success!");

                    }
                }
            } while (!count);
        }
    }
}
