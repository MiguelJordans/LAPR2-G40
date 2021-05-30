package app.ui.console;

import app.controller.SampleController;
import app.mappers.dto.TestDTO;
import app.ui.console.utils.Utils;

public class SampleUI implements Runnable {

    private final SampleController ctrl;

    public SampleUI() {
        this.ctrl = new SampleController();
    }

    @Override
    public void run() {

        boolean count;
        boolean flag;
        boolean m = false;
        boolean nbol = false;
        int b;

        TestDTO trDto;

        if (this.ctrl.getAvailableTestListDto() == null || this.ctrl.getAvailableTestListDto().isEmpty()) {
            System.out.println("The list is empty! Please, try adding at least one test in order to create the sample(s)!");

        } else {
            do {
                boolean exception = false;
                do {

                     trDto = (TestDTO) Utils.showAndSelectOne(this.ctrl.getAvailableTestListDto(), "Select the test: \n");

                    if (trDto != null)
                        m = trDto.compareState(trDto.getState());


                    if (!m) {
                        if(trDto==null){
                            System.out.println("Please choose a valid test!\n");
                        } else
                        System.out.println("Please choose a valid test (sample is already collected!)\n");
                    }

                } while (!m);

                do {
                    try {


                        int n = Utils.readIntegerFromConsole("Type the number of samples that you wish to create: ");

                        ctrl.addTest(trDto);

                        this.ctrl.createSample(n);

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
                        Utils.showListWithouThe0(ctrl.getCurrentSampleListDTO(), "Do you wish to delete any?(s/n)");
                        flag = Utils.confirm("");
                        count = flag;
                        nbol = flag;

                        if (flag) {
                            if(ctrl.getCurrentSampleList().size()>ctrl.getSampleList().size()){
                                b = ctrl.getCurrentSampleList().size();
                            } else b=0;

                            int a = Utils.readIntegerFromConsole("Type the number of the sample that you wish to delete: ");
                            ctrl.getSampleList().remove(b+(a - 1));
                            count = !flag;

                        }

                    }while(nbol);
                }


            } while (count);

            ctrl.getSm().getTr().setState("SAMPLE_COLLECTED");

        }
    }
}