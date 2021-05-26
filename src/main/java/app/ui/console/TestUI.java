package app.ui.console;

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

public class TestUI implements Runnable {

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
            System.out.println("NECESSARY DATA: ");
            System.out.println("--------------------");

            boolean exception = false;

            do {

                try {
                    String citizenCardNumber = Utils.readLineFromConsole("Please enter the Citizen Card Number of the desired Client: ");
                    String nhsCode = Utils.readLineFromConsole("Please enter the NHS Code of the Client: ");

                    if (!testController.searchClient(citizenCardNumber)) {
                        System.out.println("No Client was found");
                        return;
                    }
                    if (testController.validateNhsCode(nhsCode)){
                        System.out.println("The written NHS Code has already been used");
                        return;
                    }

                    List<TestType> testTypesList = testController.getTestType();

                    TestType testType = null;
                    String ttselected;
                    List<String> testTypeDescription = new ArrayList<>();

                    for (TestType ttp : testTypesList) {
                        testTypeDescription.add(ttp.getDescription());
                    }

                    System.out.println();
                    ttselected = Utils.showAndSelectOne(testTypeDescription, "Test Type List").toString();
                    for(TestType tt : testTypesList) {
                        if(tt.getDescription().equalsIgnoreCase(ttselected)){
                            testType = tt;
                        }
                    }
                    List<ParameterCategory> categoriesList = new ArrayList<>();
                    for(int p=0;p < testType.getPP().getParameterCategoryList().size();p++) {
                        categoriesList.add(testType.getPP().getPc()[p]);
                    }
                    List<Parameter> parameterList = testController.getParameterStore();

                    int catNumber;

                    catNumber = Utils.readIntegerFromConsole("Please enter the number of categories the test might have");
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
                        m = Utils.readIntegerFromConsole("Please enter the number of parameters the test might have?");


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
                            System.out.print("ERROR: Repeated parameters!");
                        }
                        System.out.println();
                    } else {
                        System.out.print("ERROR: Repeated categories!");
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

                        result = Utils.confirm("Test registered! Do you want to save it? (s - confirm / n - cancel)");

                        if (result) {
                            result = testController.saveTest();
                        } else {
                            System.out.println();
                            System.out.println("Canceled with success!");
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
                            System.out.println("An Error has occurred with the save.");
                        }
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Incorrect input of data (an error has occurred)! Please, try again.");
                    exception = true;
                }

            } while (exception);



        } else {
            System.out.println("ERROR: Parameter list and Parameter Category list are empty");
        }
    }
}
