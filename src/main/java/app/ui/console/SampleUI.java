package app.ui.console;

import app.controller.SampleController;
import app.controller.TestTypeController;
import app.domain.model.*;
import app.domain.shared.Constants;
import app.ui.console.utils.Utils;

import javax.swing.plaf.nimbus.State;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class SampleUI implements Runnable {

    private SampleController ctrl;
    private TestTypeStore ttStore;
    private TestStore trStore;

    public SampleUI() {
        this.ctrl = new SampleController();
        this.ttStore = new TestTypeStore();
        this.trStore = new TestStore();
    }

    @Override
    public void run() {

        boolean count = true;
        boolean flag = true;
        boolean m = false;
        boolean nbol = false;

        TestType tt = null;

        if (this.ttStore.getTestTypeList() == null || this.ttStore.getTestTypeList().isEmpty()) {
            System.out.println("The list is empty! Please, try adding at least one test in order to create the sample(s)!");

        } else {
            do {
                boolean exception = false;
                do {

                    tt = (TestType) Utils.showAndSelectOne(this.ttStore.getTestTypeList(), "Select the test: \n");

                    if (!(tt == null))
                        m = tt.compareState(tt.getState());


                    if (!m) {
                        if(tt==null){
                            System.out.println("Please choose a valid test!\n");
                        } else
                        System.out.println("Please choose a valid test (sample is already collected!)");
                    }

                } while (!m);

                do {
                    try {

                        int n = Utils.readIntegerFromConsole("Type the number of samples that you wish to create");

                        this.ctrl.CreateSample(tt, n);

                        exception = false;

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        System.out.println("Incorrect input of data (an error has occurred), please try again.");
                        exception = true;

                    }
                } while (exception);


                count = Utils.confirm("Sample(s) created! Do you wish to see them?");

                if (count) {

                    do {
                        Utils.showListWithouThe0(ctrl.getSampleList(), "Do you wish to delete any?");
                        flag = Utils.confirm("");
                        count = flag;
                        nbol = flag;

                        if (flag) {
                            int a = Utils.readIntegerFromConsole("Type the number of the sample that you wish to delete");
                            ctrl.getSampleList().remove(a - 1);
                            count = !flag;

                        }

                    }while(nbol);
                }


            } while (count);

            tt.setState("SAMPLE_COLLECTED");
        }
    }
}