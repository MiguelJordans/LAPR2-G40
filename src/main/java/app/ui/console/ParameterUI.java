package app.ui.console;

import app.controller.ParameterController;
import app.mappers.dto.ParameterCategoryDTO;
import app.ui.console.utils.Utils;

public class ParameterUI implements Runnable {

    private final ParameterController ctrl;

    public ParameterUI() {
        this.ctrl = new ParameterController();
    }

    @Override
    public void run() {

        boolean countFlag = true;
        boolean leaveFlag = true;


        if (this.ctrl.getCategoryListDto() == null || this.ctrl.getCategoryListDto().isEmpty()) {
            System.out.println("The list is empty! Please, try adding at least one parameter in order to create the laboratory.");
        } else {
            do {
                boolean exception = false;
                do {

                    ParameterCategoryDTO pc = (ParameterCategoryDTO) Utils.showAndSelectOne(this.ctrl.getCategoryListDto(), "Select the category: ");
                    ctrl.addCategory(pc);

                    if (pc == null) {
                        System.out.println("Please choose a valid category!\n");
                    } else {
                        leaveFlag=false;
                    }

                }while (leaveFlag);

                do {
                    try {

                        String code = Utils.readLineFromConsole("Please enter the code of the parameter: ");
                        String description = Utils.readLineFromConsole("Please enter the description of the parameter: ");
                        String nhsld = Utils.readLineFromConsole("Please enter the nhsld of the parameter: ");


                        ctrl.createParameter(description, code, nhsld);

                        exception = false;

                    } catch (Exception e) {

                        System.out.println(e.getMessage());
                        System.out.println("Incorrect input of data (an error has occurred), please try again.");
                        exception = true;

                    }
                } while (exception);

                countFlag = Utils.confirm("Parameter created! Do you wish to save it(s/n)?" + ctrl.getPP());

                if (countFlag) {

                    if (this.ctrl.saveParameter()) {
                        System.out.println("Save successful!");

                    } else System.out.println("Save not sucessful! Please try again.");
                }
            } while (!countFlag);
        }
    }
}
