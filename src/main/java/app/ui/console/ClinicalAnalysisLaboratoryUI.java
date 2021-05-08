package app.ui.console;

import app.controller.ClinicalAnalysisLaboratoryController;
import app.ui.console.utils.Utils;

public class ClinicalAnalysisLaboratoryUI implements Runnable {

    private ClinicalAnalysisLaboratoryController ctrl;

    public ClinicalAnalysisLaboratoryUI() {
        this.ctrl = new ClinicalAnalysisLaboratoryController();
    }

    @Override
    public void run() {
        boolean count = true;
        boolean exception = false;
        do {
            try {
                String laboratoryID = Utils.readLineFromConsole("Please enter the laboratoryID of the Clinical Analysis Laboratory");
                String name = Utils.readLineFromConsole("Please enter the name of the Clinical Analysis Laboratory");
                String address = Utils.readLineFromConsole("Please enter the address of the Clinical Analysis Laboratory");
                String phoneNumber = Utils.readLineFromConsole("Please enter the phone number of the Clinical Analysis Laboratory");
                String TINnumber = Utils.readLineFromConsole("Please enter the TIN number of the Clinical Analysis Laboratory");
                ctrl.CreateClinicalAnalysisLaboratory(laboratoryID, name, address, phoneNumber, TINnumber);
                exception = false;

            } catch (Exception e){
                e.printStackTrace();
                System.out.println("Incorrect input of data (an error has occured)! Please, try again.");
                exception = true;
            }
        } while (exception);

        count = Utils.confirm("Clinical Analysis Laboratory created! Do you want to save it?" + ctrl.getCAL());
        if (count) {
            if (ctrl.saveClinicalAnalysisLaboratory()) {
                System.out.println("Clinical Analysis Laboratory was saved with success!");
            }
        }
    }
}