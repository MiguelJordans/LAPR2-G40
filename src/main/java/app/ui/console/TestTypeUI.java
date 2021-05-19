package app.ui.console;

import app.controller.TestTypeController;
import app.domain.model.Parameter;
import app.domain.model.ParameterCategory;
import app.domain.model.ParameterCategoryStore;
import app.domain.model.ParameterStore;
import app.ui.console.utils.Utils;

public class TestTypeUI implements Runnable {

    private TestTypeController ctrl;
    private ParameterCategoryStore pcStore;

    public TestTypeUI() {
        this.ctrl = new TestTypeController();
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

                        String collectingMethod = Utils.readLineFromConsole("Please enter the collecting method for the Test Type");
                        String description = Utils.readLineFromConsole("Please enter the description of the test type");
                        String testCode = Utils.readLineFromConsole("Please enter the testCode of the Test Type");

                        ParameterCategoryStore pc1 = pcStore;
                        ctrl.CreateTestType(description, testCode, collectingMethod, pc1);

                        exception = false;

                    } catch (Exception e) {

                        e.printStackTrace();
                        System.out.println("Incorrect input of data (an error has occurred), please try again.");
                        exception = true;

                    }
                } while (exception);

                count = Utils.confirm("Test Type created! Do you wish to save it?" + ctrl.getTT());

                if (count) {

                    if (this.ctrl.saveTestType()) {
                        System.out.println("Test type was saved with success!");

                    }
                }
            } while (!count);
        }
    }
}
