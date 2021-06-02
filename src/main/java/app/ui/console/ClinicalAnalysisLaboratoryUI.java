package app.ui.console;

import app.controller.ClinicalAnalysisLaboratoryController;
import app.mappers.dto.TestTypeDTO;
import app.ui.console.utils.Utils;

public class ClinicalAnalysisLaboratoryUI implements Runnable {

    private ClinicalAnalysisLaboratoryController ctrl;

    public ClinicalAnalysisLaboratoryUI() {
        this.ctrl = new ClinicalAnalysisLaboratoryController();
    }

    @Override
    public void run() {

        boolean count = true;
        boolean leave = true;

        ctrl.addTestTypeList();

        if (this.ctrl.getTestTypeList() == null || this.ctrl.getTestTypeList().isEmpty()) {
            System.out.println("The list is empty! Please, try adding at least one test type in order to create the laboratory.");
        } else {
            do {
                boolean exception = false;
                do {

                    TestTypeDTO tt = (TestTypeDTO) Utils.showAndSelectOne(this.ctrl.getTestTypeListDto(), "Select the test types: ");
                    ctrl.addTestTypesToTtList(tt);

                    if (tt == null) {
                        System.out.println("Please choose a valid test type!\n");
                    } else {
                        leave = Utils.confirm("Do you wish to select more test types(s/n)?");
                    }

                } while (leave);

                do {
                    try {
                        String laboratoryID = Utils.readLineFromConsole("Please enter the laboratoryID of the Clinical Analysis Laboratory: ");
                        String name = Utils.readLineFromConsole("Please enter the name of the Clinical Analysis Laboratory: ");
                        String address = Utils.readLineFromConsole("Please enter the address of the Clinical Analysis Laboratory: ");
                        String phoneNumber = Utils.readLineFromConsole("Please enter the phone number of the Clinical Analysis Laboratory: ");
                        String tINnumber = Utils.readLineFromConsole("Please enter the TIN number of the Clinical Analysis Laboratory: ");

                        this.ctrl.createClinicalAnalysisLaboratory(laboratoryID, name, address, phoneNumber, tINnumber);
                        exception=false;
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                        System.out.println("Incorrect input of data (an error has occured)! Please, try again.");
                        exception = true;
                    }
                } while (exception);

                count = Utils.confirm("Clinical Analysis Laboratory created! Do you want to save it(s/n)?" + ctrl.getCAL());
                if (count && this.ctrl.saveClinicalAnalysisLaboratory()) {
                        System.out.println("Save successful!");
                }
            } while (!count);
        }
    }
}