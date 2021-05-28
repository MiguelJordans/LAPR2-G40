package app.ui.console;

import app.controller.TestTypeController;
import app.domain.mappers.dto.ParameterCategoryDTO;
import app.ui.console.utils.Utils;


public class TestTypeUI implements Runnable {

    private TestTypeController ctrl;

    public TestTypeUI() {
        this.ctrl = new TestTypeController();
    }

    @Override
    public void run() {

        boolean count = true;
        boolean leave = true;

        if (this.ctrl.getCategoryListDto() == null || this.ctrl.getCategoryListDto().isEmpty()) {
            System.out.println("The list is empty! Please, try adding at least one parameter in order to create the laboratory.");
        } else {
            do {
                boolean exception = false;
                do {

                    ParameterCategoryDTO pc = (ParameterCategoryDTO) Utils.showAndSelectOne(this.ctrl.getCategoryListDto(), "Select the category: ");
                    ctrl.addCategoriesTopcList(pc);

                    if (pc == null) {
                        System.out.println("Please choose a valid category!\n");
                    } else {
                        leave = Utils.confirm("Do you wish to select more categories(s/n)?");
                    }

                }while (leave);

                do {
                    try {

                        String collectingMethod = Utils.readLineFromConsole("Please enter the collecting method for the Test Type");
                        String description = Utils.readLineFromConsole("Please enter the description of the test type");
                        String testCode = Utils.readLineFromConsole("Please enter the testCode of the Test Type");


                        ctrl.CreateTestType(description, testCode, collectingMethod);

                        exception = false;

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        System.out.println("Incorrect input of data (an error has occurred), please try again.");
                        exception = true;

                    }
                } while (exception);

                count = Utils.confirm("Test Type created! Do you wish to save it(s/n)?" + ctrl.getTT());

                if (count) {

                    if (this.ctrl.saveTestType()) {
                        System.out.println("Save successful!");

                    } else System.out.println("Save not sucessful! Please try again.");
                }
            } while (!count);
        }
    }
}
