package app.ui.console;

import app.domain.model.*;
import app.domain.stores.SampleStore;
import app.ui.console.utils.Utils;

public class RegisteredSampleUI implements Runnable {

    private SampleStore smStore;

    public RegisteredSampleUI() {
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