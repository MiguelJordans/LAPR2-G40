package app.domain.stores;

import app.domain.model.ParameterCategory;
import app.domain.model.TestType;

import java.util.ArrayList;
import java.util.List;

public class TestTypeStore {

    static List<TestType> list = new ArrayList<>();
    TestType tt;

    /**
     *
     * Creates a Test Type (Calling the TestType constructor)
     *
     * @param description the Test Type's description
     * @param testCode the Test Type's test code
     * @param collectingMethod the Test Type's collecting method
     * @param pcList the Test Type's category list
     * @return the test type created
     */

    public TestType createTestType(String description,String testCode,String collectingMethod,List<ParameterCategory> pcList){

        this.tt = new TestType(testCode,description,collectingMethod,pcList);

        return this.tt;
    }

    /**
     * Validates a test type
     *
     * @param tt the object Test Type
     * @return the validation of the Test Type being created
     */

    public boolean validateTestType(TestType tt){
        if(tt==null||listContain(tt)){
            return false;
        }
        return true;
    }

    /**
     * Checks if the new objected created is already in the list
     *
     * @param tt the object Test Type
     * @return true if the list contains the Test Type and false if it doesn't
     */

    public boolean listContain(TestType tt){

        if(this.list.contains(tt)){
            return true;
        } else {
            return false;
        }
    }

    /**
     * Saves an instance of Test Type.
     *
     * @return the saving of an instance of a Test Type
     */

    public boolean saveTestType(){
        if(validateTestType(tt)){
            listAdd(tt);
            return true;
        } else {
            return false;
        }

    }

    /**
     * Adds an instance of Test Type to the list.
     *
     * @param tt - the test type
     * @return the addition of the Test Type to the list
     */

    public boolean listAdd(TestType tt){
        list.add(tt);
        return true;
    }

    /**
     * Replaces the element of the specified position in the list with the specified element.
     *
     * @param i the index of the element to replace
     * @return the element previously at the specified postion
     */

    public TestType getTestType(int i){
        return list.get(i);
    }

    /**
     * Gets Test type from the list.
     *
     * @return the Test Type requested
     */

    public TestType getTt() {
        return tt;
    }

    /**
     * Returns the list of test types already created
     *
     * @return the list of test types already created
     */

    public List<TestType> getTestTypeList() {
        return list;
    }

}