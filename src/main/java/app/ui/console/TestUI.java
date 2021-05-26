/*package app.ui.console;

import app.controller.App;
import app.controller.ParameterCategoryController;
import app.controller.ParameterController;
import app.controller.TestController;
import app.domain.model.Company;
import app.domain.model.Parameter;
import app.domain.model.ParameterCategory;
import app.domain.model.TestType;
import app.ui.console.utils.Utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TestUI {

    TestController testController;
    ParameterController parameterController;
    ParameterCategoryController parameterCategoryController;
    List<Parameter> selectedParameters = new ArrayList<>();

    public TestUI() {
        testController = new TestController();
        parameterController = new ParameterController();
        parameterCategoryController = new ParameterCategoryController();
    }

    public void run() {
        List<ParameterCategory> catList = null;
        List<Parameter> ppList = null;
        try {
            catList = parameterCategoryController.getParameterList();
            ppList = parameterController.getParameterList();
        } catch (Exception ignored) {
        }


        if (ppList != null && !ppList.isEmpty() && catList != null && !catList.isEmpty()) {

            System.out.println();
            System.out.println();
            System.out.println("INFORMATION REQUIRED");
            System.out.println("--------------------");
            String citizenCardNumber = Utils.readLineFromConsole("Citizen Card Number: ");
            if (!testController.searchClient(citizenCardNumber)) {
                System.out.println("Client not found!");
                return;
            }
            String nhsCode = Utils.readLineFromConsole("NHS Code: ");
            if (testController.validateNhsCode(nhsCode)){
                System.out.println("There is already a test registered with that NHS Code!");
                return;
            }
            List<TestType> testTypesList = testController.getTestType();

            TestType testType = null;
            String ttn;
            List<String> testTypeDescription = new ArrayList<>();

            for (TestType tp : testTypesList) {
                testTypeDescription.add(tp.getDescription());
            }

            System.out.println();
            ttn = Utils.showAndSelectOne(testTypeDescription, "Test Type List").toString();
            for(TestType tt : testTypesList) {
                if(tt.getDescription().equalsIgnoreCase(ttn)){
                    testType = tt;
                }
            }
            List<ParameterCategory> categoriesList = new ArrayList<>();
            for(int p=0;p < testType.getPP().getParameterCategoryList().size();p++) {
                categoriesList.add(testType.getCat()[p]);
            }
            List<Parameter> parameterList = testController.getParameterStore();

            int catNumber;

            catNumber = Utils.readIntegerFromConsole("How many categories will the test have?");
            String[] categories = new String[catNumber];

            List<String> categoryName = new ArrayList<>();

            for (ParameterCategory pc : categoriesList) {
                categoryName.add(pc.getName());
            }


            for (int c = 0; c < catNumber; c++) {
                categories[c] = (String) Utils.showAndSelectOne(categoryName, "Category List");
            }

            boolean result = false;
            boolean duplicates = false;

            for (int j = 0; j < categories.length; j++) {
                for (int k = 0; k < categories.length; k++) {
                    if (k != j && categories[k].equals(categories[j])) {
                        duplicates = true;
                        break;
                    }
                }
            }

            int m = 0;

            if (!duplicates) {

                selectedParameters = new ArrayList<>();
                m = Utils.readIntegerFromConsole("How many parameters will the test have?");


                List<String> parameterName = new ArrayList<>();
                String name, select;

                for (int r = 0; r < catNumber; r++) {
                    for (Parameter par : parameterList) {
                        if (par.getCat().getName().equals(categories[r])) {
                            parameterName.add(par.getName());
                        }
                    }
                }


                for (int l = 0; l < m; l++) {
                    System.out.println();
                    select = (String) Utils.showAndSelectOne(parameterName, "Parameter List");
                    for (int c = 0; c < parameterName.size(); c++) {
                        if (select.equals(parameterList.get(c).getName())) {
                            selectedParameters.add(parameterList.get(c));
                        }
                    }
                }

                java.util.HashSet unique = new HashSet();
                for (Parameter p : selectedParameters){
                    if(!unique.add(p)){
                        duplicates = true;
                    }
                }

                if (!duplicates) {
                    try {
                        result = testController.createTest(citizenCardNumber, nhsCode, testType, selectedParameters);
                    } catch (Exception ignored) {
                    }
                } else {
                    System.out.print("There cannot be repeated parameters!");
                }
                System.out.println();
            } else {
                System.out.print("There cannot be repeated categories!");
            }

            System.out.println();

            if (result) {
                System.out.println();
                System.out.println("TEST DATA");
                System.out.println("-------------");
                System.out.println("NHS Code: " + nhsCode);
                System.out.println("Test Type: " + testType.getDescription());
                System.out.print("Categories: ");

                for (int c = 0; c < catNumber; c++) {
                    System.out.print(categories[c] + "; ");
                }
                System.out.println();
                System.out.print("Parameters: ");
                for (int c = 0; c < m; c++) {
                    System.out.print(selectedParameters.get(c).getName() + "; ");
                }

                result = Utils.confirm("s -> confirm    n -> cancel");

                if (result) {
                    result = testController.saveTest();
                } else {
                    System.out.println();
                    System.out.println("Operation Canceled");
                    return;
                }

                System.out.println();
                if (result) {
                    System.out.println("Test saved with success!");

                    System.out.println();
                    System.out.println();

                    App app = App.getInstance();
                    Company company = app.getCompany();

                } else {
                    System.out.println("Error with test save!");
                }
            }
        } else {
            System.out.println("Parameter Category list and Parameter List cannot be empty");
        }
    }

}*/
