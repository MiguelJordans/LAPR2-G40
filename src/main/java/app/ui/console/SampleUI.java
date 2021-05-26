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

    public SampleUI() {
        this.ctrl = new SampleController();
        this.ttStore = new TestTypeStore();
    }

    @Override
    public void run() {

        boolean count = true;
        boolean flag = true;
        boolean m = false;

        TestType tt = null;

        if (this.ttStore.getTestTypeList() == null || this.ttStore.getTestTypeList().isEmpty()) {
            System.out.println("The list is empty! Please, try adding at least one test in order to create the sample(s)!");

        } else {
            do {
                boolean exception = false;
                do {

                    tt = (TestType) Utils.showAndSelectOne(this.ttStore.getTestTypeList(), "Select the test");

                    if (!(tt == null))
                        m = tt.compareState(tt.getState());

                    if (tt == null) {
                        List<MenuItem> options = new ArrayList<MenuItem>();
                        options.add(new MenuItem("DN", new AdminUI()));
                        options.get(0).run();
                    }

                    if (!m) {
                        System.out.println("Please choose a valid test(sample is already collected!)");
                    }

                } while (!m);

                do {
                    try {

                        int n = Utils.readIntegerFromConsole("Type the number of samples that you wish to create");

                        this.ctrl.CreateSample(tt, n);

                        exception = false;

                    } catch (Exception e) {

                        System.out.println("Incorrect input of data (an error has occurred), please try again.");
                        exception = true;

                    }
                } while (exception);


                count = Utils.confirm("Sample(s) created! Do you wish to see them?");

                if (count) {

                    Utils.showList(ctrl.getSampleList(), "Do you wish to delete any?");
                    flag = Utils.confirm("");
                    count = flag;

                    if (flag) {
                        int a = Utils.readIntegerFromConsole("Type the number of the sample that you wish to delete");
                        ctrl.getSampleList().remove(a - 1);
                        Utils.showList(ctrl.getSampleList(), "");

                    }

                }


            } while (count);
            tt.setState("SAMPLE_COLLECTED");
        }
    }
}