package app.domain.model;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.util.HashSet;

public class TestStore {

    private final List<Test> testList = new ArrayList<>();
    private static int testNumber = 1;

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

    public boolean saveTest(Test test) {
        if (validateTest(test)) {
            testList.add(test);
            testNumber++;
            return true;
        }
        return false;
    }

    public String generateId() {
        String id;

        id = String.format("%012d", testNumber);
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

    public HashSet<Test> getInvalidTestList() {
        HashSet<Test> invalidTests = new HashSet<>();
        for (Test temp : testList) {
            if (!temp.isValid()) {
                invalidTests.add(temp);
            }
        }
        return invalidTests;//implement;
    }


    public boolean validateTest(String testId, LocalDate instant) {
        for (Test temp : testList) {
            /*
            if(temp.id().equals(testId)){
                temp.validate(instant);
            }*/
        }
        return true;
    }
}

