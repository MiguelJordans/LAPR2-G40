package app.ui.console;

import app.ui.console.utils.Utils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Paulo Maio <pam@isep.ipp.pt>
 */

public class AdminUI implements Runnable {
    public AdminUI() {
    }

    public void run() {

        List<MenuItem> options = new ArrayList<MenuItem>();
        options.add(new MenuItem("Specify a new Parameter Category", new ParameterCategoryUI()));
        options.add(new MenuItem("Create a new Test Type", new TestTypeUI()));
        options.add(new MenuItem("Register a new Clinical Analysis Laboratory", new ClinicalAnalysisLaboratoryUI()));
<<<<<<< HEAD
        options.add(new MenuItem("Specify a new Parameter", new ParameterUI()));
        options.add(new MenuItem("Register a new Employee", new EmployeeUI()));
        options.add(new MenuItem("Sample", new SampleUI()));
        options.add(new MenuItem("Sample2", new RegisteredSampleUI()));

=======
        options.add(new MenuItem("Specify a new parameter ", new ParameterUI()));
        options.add(new MenuItem("Register a new employee ", new EmployeeUI()));
        
>>>>>>> da1a645666dd4f441e5604e08cc8080f327eaad1
        int option = 0;
        do {
            option = Utils.showAndSelectIndex(options, "\n\nAdmin Menu:");

            if ((option >= 0) && (option < options.size())) {

                options.get(option).run();
            }
        }
        while (option != -1);
    }
}