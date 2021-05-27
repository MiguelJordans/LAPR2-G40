package app.domain.model;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.util.HashSet;

public class TestStore {

    private final List<Test> tests = new ArrayList<>();
    private static int testNumber = 1;

    public List<Test> getTests() {
        return tests;
    }

    public Test createTest(String citizenCardNumber, String testID, String nhsCode, TestType testType) {
        Test test = new Test(citizenCardNumber, testID, nhsCode, testType);

        if (validateTest(test)) {
            return test;
        }
        return null;
    }

    public boolean validateTest(Test test) {

        if (test == null)
            return false;

        for (Test test1 : tests) {
            if (test1.getTestID().equalsIgnoreCase(test.getTestID()) || (test1.getNhsCode().equalsIgnoreCase(test.getNhsCode()))) {
                return false;
            }
        }
        return true;
    }

    public boolean saveTest(Test test) {
        if (validateTest(test)) {
            tests.add(test);
            testNumber++;
            return true;
        }
        return false;
    }

    public String generateTestID() {
        String testID;

        testID = String.format("%012d", testNumber);
        return testID;
    }

    public boolean validateNhsCode(String nhsCode) {
        for (Test test1 : tests) {
            if (test1.getNhsCode().equalsIgnoreCase(nhsCode)) {
                return true;
            }
        }
        return false;
    }

    public HashSet<Test> getInvalidTestList() {
        HashSet<Test> invalidTests = new HashSet<>();
        for (Test temp : tests) {
            if (!temp.isValid()) {
                invalidTests.add(temp);
            }
        }
        return invalidTests;//implement;
    }

/*
    public boolean validateTest(String testId, LocalDate instant) {
        for (Test temp : tests) {
            if (temp.getTestID().equals(testId)) {
                temp.validate(instant);
            }
        }
        return true;
    }
 */
}

