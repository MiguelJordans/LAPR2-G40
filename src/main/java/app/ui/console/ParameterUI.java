package app.ui.console;

import app.controller.ParameterController;
import app.controller.TestTypeController;
import app.domain.ParameterCategory;
import app.domain.ParameterCategoryStore;
import app.domain.ParameterStore;
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
        boolean leave = false;
        if (this.pcStore.getParameterCategoryList() == null || this.pcStore.getParameterCategoryList().isEmpty()) {
            System.out.println("The list is empty! Please, try adding at least one parameter in order to create the laboratory.");
        } else {
            do {
                boolean exception = false;
                do {
                    ParameterCategory pc = (ParameterCategory) Utils.showAndSelectOne(this.pcStore.getParameterCategoryList(), "Select the categories");
                    this.pcStore.listAdd();
                    leave = Utils.confirm("Do you wish to select more parameters?");
                } while (leave);
                do {
                    try {
                        String name = Utils.readLineFromConsole("Please enter the name of the parameter");
                        String description = Utils.readLineFromConsole("Please enter the description of the parameter");
                        String code = Utils.readLineFromConsole("Please enter the code of the parameter");

                        ParameterCategoryStore pc = (ParameterCategoryStore) Utils.showAndSelectOne(this.pcStore.getParameterCategoryList(), "Select the categories");

                        ctrl.CreateParameter(description, code, name, pc);
                        exception = false;
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Incorrect input of data (an error has ocurred), please try again.");
                        exception = true;
                    }
                } while (exception);
                count = Utils.confirm("Parameter created! Do you wish to save it?" + ctrl.getPP());
                if (count) {
                    if (ctrl.saveParameter()) {
                        System.out.println("Parameter was saved with sucess!");
                    }
                }
            }while (!count);
        }
    }
}
