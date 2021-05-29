package app.ui.console;

import app.ui.console.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class LaboratoryCoordinatorUI implements Runnable {

    public LaboratoryCoordinatorUI(){
        //Laboratory Coordinator menu
    }

    @Override
    public void run() {
        List<MenuItem> options = new ArrayList<>();
        options.add(new MenuItem("Validates a test", new TestValidationUI()));
        int option = 0;
        do {
            option = Utils.showAndSelectIndex(options, "\n\nLaboratoryCoordinator Menu:");

            if ((option >= 0) && (option < options.size())) {
                options.get(option).run();
            }
        }
        while (option != -1);
    }

}
