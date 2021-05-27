package app.ui.console;

import app.ui.console.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class MedicalLabTechnicianUI implements Runnable {

    public MedicalLabTechnicianUI() {
    }

    public void run() {
        List<MenuItem> options = new ArrayList<MenuItem>();
        options.add(new MenuItem("Register new sample(s) ", new SampleUI()));
        options.add(new MenuItem("See all samples registered", new RegisteredSampleUI()));

        int option = 0;
        do {
            option = Utils.showAndSelectIndex(options, "\n\nMedical lab technician menu:");

            if ((option >= 0) && (option < options.size())) {

                options.get(option).run();
            }
        }
        while (option != -1);
    }
}
