package app.ui.console;

import app.ui.console.utils.Utils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Paulo Maio <pam@isep.ipp.pt>
 */

public class AdminUI implements Runnable {
    public AdminUI() {
        //Admin UI
    }

    public void run() {

        List<MenuItem> options = new ArrayList<>();
        options.add(new MenuItem("Specify a new parameter category ", new ParameterCategoryUI()));
        options.add(new MenuItem("Create a new Test Type ", new TestTypeUI()));
        options.add(new MenuItem("Register a new Clinical Analysis Laboratory", new ClinicalAnalysisLaboratoryUI()));
        options.add(new MenuItem("Specify a new parameter ", new ParameterUI()));
        options.add(new MenuItem("Register a new employee ", new EmployeeUI()));

        
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