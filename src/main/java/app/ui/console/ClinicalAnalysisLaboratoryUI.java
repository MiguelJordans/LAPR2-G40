package app.ui.console;

import app.controller.ClinicalAnalysisLaboratoryController;
import app.domain.model.TestType;
import app.domain.model.TestTypeStore;
import app.ui.console.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class ClinicalAnalysisLaboratoryUI implements Runnable {

    private ClinicalAnalysisLaboratoryController ctrl;
    private TestTypeStore ttStore;
    private List<TestType> ttList;

    public ClinicalAnalysisLaboratoryUI() {
        this.ctrl = new ClinicalAnalysisLaboratoryController();
        this.ttStore = new TestTypeStore();
        this.ttList = new ArrayList<>();
    }

    @Override
    public void run() {

        boolean count = true;
        boolean leave = false;

        if (this.ttStore.getTestTypeList() == null || this.ttStore.getTestTypeList().isEmpty()) {
            System.out.println("The list is empty! Please, try adding at least one test type in order to create the laboratory.");
        } else {
            do {
                boolean exception = false;
                do {

                    TestType tt = (TestType) Utils.showAndSelectOne(this.ttStore.getTestTypeList(), "Select the test types");
                    this.ttList.add(tt);

                    if (tt == null) {
                        List<MenuItem> options = new ArrayList<MenuItem>();
                        options.add(new MenuItem("DN", new AdminUI()));
                        options.get(0).run();
                    }

                    leave = Utils.confirm("Do you wish to select more test types?");

                } while (leave);

                do {
                    try {
                        String laboratoryID = Utils.readLineFromConsole("Please enter the laboratoryID of the Clinical Analysis Laboratory");
                        String name = Utils.readLineFromConsole("Please enter the name of the Clinical Analysis Laboratory");
                        String address = Utils.readLineFromConsole("Please enter the address of the Clinical Analysis Laboratory");
                        String phoneNumber = Utils.readLineFromConsole("Please enter the phone number of the Clinical Analysis Laboratory");
                        String tinNumber = Utils.readLineFromConsole("Please enter the TIN number of the Clinical Analysis Laboratory");

<<<<<<< HEAD
                        this.ctrl.CreateClinicalAnalysisLaboratory(laboratoryID, name, address, phoneNumber, tinNumber);
                    } catch (Exception e){
                        e.printStackTrace();
                        System.out.println("Incorrect input of data (an error has occurred)! Please, try again.");
=======
                        this.ctrl.CreateClinicalAnalysisLaboratory(laboratoryID, name, address, phoneNumber, TINnumber,ttList);
                    } catch (Exception e){
                        System.out.println("Incorrect input of data (an error has occured)! Please, try again.");
>>>>>>> da1a645666dd4f441e5604e08cc8080f327eaad1
                        exception = true;
                    }
                } while (exception);

                count = Utils.confirm("Clinical Analysis Laboratory created! Do you want to save it?" + ctrl.getCAL());
                if (count) {
                    if (this.ctrl.saveClinicalAnalysisLaboratory()) {
                        System.out.println("Clinical Analysis Laboratory was saved with success!");
                    }
                }
            } while (!count);
        }
    }
}