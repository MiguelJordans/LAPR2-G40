package app.ui.console;

import app.controller.ParameterController;
import app.controller.TestTypeController;
import app.domain.model.ParameterCategory;
import app.domain.model.ParameterCategoryStore;
import app.domain.model.ParameterStore;
import app.ui.console.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class ParameterUI implements Runnable {

    private ParameterController ctrl;
    private ParameterCategoryStore pcStore;
    private List<ParameterCategory> pcList;

    public ParameterUI() {
        this.ctrl = new ParameterController();
        this.pcStore = new ParameterCategoryStore();
        this.pcList = new ArrayList<>();
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
                this.pcList.add(pc);

                if (pc == null) {
                    List<MenuItem> options = new ArrayList<MenuItem>();
                    options.add(new MenuItem("DN", new AdminUI()));
                    options.get(0).run();
                }

                do {
                    try {

                        String code = Utils.readLineFromConsole("Please enter the code of the Parameter");
                        String description = Utils.readLineFromConsole("Please enter the description of the Parameter");
                        String nhsld = Utils.readLineFromConsole("Please enter the nhsld of the Parameter");


                        ctrl.CreateParameter(description, code, nhsld, pcList);

                        exception = false;

                    } catch (Exception e) {

                        System.out.println(e.getMessage());
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
