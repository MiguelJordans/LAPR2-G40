package app.ui.console;

import app.controller.TestTypeController;
import app.domain.model.TestType;
import app.ui.console.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class TestTypeUI {


        private TestTypeController ctrl;


    public TestTypeUI()
    {
        this.ctrl = new TestTypeController();
    }




    public void run()
    {
        List<MenuItem> options = new ArrayList<MenuItem>();
        options.add(new MenuItem("Option1: Create test type ", new ShowTextUI("You have chosen Option 1.")));

        int option = 0;
        do
        {
            option = Utils.showAndSelectIndex(options, "\n\nAdmin Menu:");

            if ( (option >= 0) && (option < options.size()))
            {
                options.get(option).run();
            }
        }
        while (option != -1 );
    }
}