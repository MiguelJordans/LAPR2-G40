package app.domain.model;

import java.util.ArrayList;
import java.util.List;

public class TestStore {

    private final List<Test> testList = new ArrayList<>();
    private static int numberTests = 1;

    public List<Test> getTests() {
        return testList;
    }

    public Test createTest(String citizenCardNumber, String id, String nhsCode, TestType testType) {
        Test test = new Test(citizenCardNumber, id, nhsCode, testType);

        if (validateTest(test)) {
            return test;
        }
        return null;
    }

    public boolean validateTest(Test test) {

        if (test == null)
            return false;

        for (Test test1 : testList) {
            if (test1.getTestCode().equalsIgnoreCase(test.getTestCode()) || (test1.getNhsCode().equalsIgnoreCase(test.getNhsCode()))) {
                return false;
            }
        }

        return true;
    }

    public boolean saveTest(Test test){
        if(validateTest(test)){
            testList.add(test);
            numberTests++;
            return true;
        }
        return false;
    }

    public String generateId() {
        String id;

        id = String.format("%012d", numberTests);
        return id;
    }

    public boolean validateNhsCode(String nhsCode) {
        for (Test test1 : testList) {
            if (test1.getNhsCode().equalsIgnoreCase(nhsCode)) {
                return true;
            }
        }
        return false;
    }

}
