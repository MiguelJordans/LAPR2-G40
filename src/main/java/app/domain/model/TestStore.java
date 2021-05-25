package app.domain.model;

import java.time.LocalDate;
import java.util.HashSet;

public class TestStore {
    HashSet<Test> testList= new HashSet<>();

    public HashSet<Test> getInvalidTestList(){
        HashSet<Test> invalidTests= new HashSet<>();
        for(Test temp: testList){
            if(!temp.isValid()){
                invalidTests.add(temp);
            }
        }
        return invalidTests;//implement;
    }
    public boolean saveTest(Test t){
        return testList.add(t);
    }

    public boolean validateTest(String testId, LocalDate instant) {
        for(Test temp: testList){
            /*
            if(temp.id().equals(testId)){
                temp.validate(instant);
            }*/
        }
        return true;
    }
}
