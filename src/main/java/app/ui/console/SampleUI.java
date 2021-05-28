package app.ui.console;

import app.controller.SampleController;
import app.domain.model.*;
import app.ui.console.utils.Utils;

public class SampleUI implements Runnable {

    private SampleController ctrl;
    private TestStore trStore;

    public SampleUI() {
        this.ctrl = new SampleController();
        this.trStore = new TestStore();
    }

    @Override
    public void run() {

        boolean count = true;
        boolean flag = true;
        boolean m = false;
        boolean nbol = false;

        Test tr = null;

        if (this.trStore.getTestList() == null || this.trStore.getTestList().isEmpty()) {
            System.out.println("The list is empty! Please, try adding at least one test in order to create the sample(s)!");

        } else {
            do {
                boolean exception = false;
                do {

                    tr = (Test) Utils.showAndSelectOne(this.trStore.getTestList(), "Select the test: \n");

                    if (tr != null)
                        m = tr.compareState(tr.getState());


                    if (!m) {
                        if(tr==null){
                            System.out.println("Please choose a valid test!\n");
                        } else
                        System.out.println("Please choose a valid test (sample is already collected!)\n");
                    }

                } while (!m);

                do {
                    try {

                        int n = Utils.readIntegerFromConsole("Type the number of samples that you wish to create: ");

                        this.ctrl.CreateSample(tr, n);

                        exception = false;

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        System.out.println("Incorrect input of data (an error has occurred), please try again.");
                        exception = true;

                    }
                } while (exception);


                count = Utils.confirm("Sample(s) created! Do you wish to see it(them) (s/n)?");

                if (count) {

                    do {
                        Utils.showListWithouThe0(ctrl.getSampleList(), "Do you wish to delete any?(s/n)");
                        flag = Utils.confirm("");
                        count = flag;
                        nbol = flag;

                        if (flag) {
                            int a = Utils.readIntegerFromConsole("Type the number of the sample that you wish to delete: ");
                            ctrl.getSampleList().remove(a - 1);
                            count = !flag;

                        }

                    }while(nbol);
                }


            } while (count);

            tr.setState("SAMPLE_COLLECTED");

        }
    }
}