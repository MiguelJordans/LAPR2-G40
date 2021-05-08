package app.domain;

import java.util.ArrayList;
import java.util.List;

public class TestTypeStore {

    static List<TestType> list = new ArrayList<TestType>();
    TestType tt;

    public TestTypeStore(){}

    public TestType CreateTestType(String description,String testCode,String collectingMethod,ParameterCategoryStore pc){
        return this.tt = new TestType(testCode,description,collectingMethod,pc);
    }

    public boolean validateTestType(TestType tt){
        if(tt==null||listContain(tt)){
            return false;
        }
        return true;
    }

    public boolean listContain(TestType tt){
        if(this.list.contains(tt)){
            return true;
        } else {
            return false;
        }
    }

    public boolean saveTestType(){
        if(validateTestType(tt)){
            listAdd(tt);
            return true;
        } else {
            return false;
        }

    }

    public boolean listAdd(TestType tt){
        list.add(tt);
        return true;
    }

    public TestType getTestType(int i){
        return list.get(i);
    }

    public TestType getTt() {
        return tt;
    }

    public List<TestType> getTestTypeList() {
        return list;
    }
}