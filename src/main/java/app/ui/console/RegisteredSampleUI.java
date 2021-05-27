package app.ui.console;

import app.controller.SampleController;
import app.controller.TestTypeController;
import app.domain.model.*;
import app.ui.console.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class RegisteredSampleUI implements Runnable {

    private SampleController ctrl;
    private SampleStore smStore;

    private List<Sample> list = new ArrayList<>();

    public RegisteredSampleUI() {
        this.ctrl = new SampleController();
        this.smStore = new SampleStore();
    }

    @Override
    public void run() {


        boolean count;
        boolean flag = false;

        do {

            String code = Utils.readLineFromConsole("Type the test ID to see the registered samples of that test: ");

            do {

                try {
                    for (Sample sm1 : smStore.getSampleList()) {

                        if (code.equals(sm1.getTr().getTestID())) {
                            System.out.println(sm1);
                        } else {
                            System.out.println("Test code invalid! Please try to type a valid test!");
                        }
                        flag = true;
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    System.out.println("The list is empty! Please try to add samples before!");
                }
            } while (!flag);

            count = Utils.confirm("Do you wish to see more samples?");

        } while (count);
    }
}