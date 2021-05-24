package app.ui.console;

import app.controller.SampleController;
import app.controller.TestTypeController;
import app.domain.model.*;
import app.ui.console.utils.Utils;

public class SampleUI implements Runnable {

    private SampleController ctrl;
    private TestTypeStore ttStore;

    public SampleUI() {
        this.ctrl = new SampleController();
        this.ttStore = new TestTypeStore();
    }

    @Override
    public void run() {

        boolean count = true;


        if (this.ttStore.getTestTypeList() == null || this.ttStore.getTestTypeList().isEmpty()) {
            System.out.println("The list is empty! Please, try adding at least one test in order to create the sample(s)!");
        } else {
            do {
                boolean exception = false;

                TestType tt = (TestType) Utils.showAndSelectOne(this.ttStore.getTestTypeList(), "Select the test");

                do {
                    try {

                        int n = Utils.readIntegerFromConsole("Type the number of samples that you wish to create");

                        ctrl.CreateSample(tt,n);

                        exception = false;

                    } catch (Exception e) {

                        System.out.println("Incorrect input of data (an error has occurred), please try again.");
                        exception = true;

                    }
                } while (exception);

                count = Utils.confirm("Sample created! Do you wish to save it?" + ctrl.getSm());

                if (count) {

                    if (this.ctrl.saveSample()) {
                        System.out.println("Sample was saved with success!");

                    }
                }
            } while (!count);
        }
    }
}