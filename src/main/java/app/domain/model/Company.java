package app.domain.model;

import app.controller.TestTypeController;
import auth.AuthFacade;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 *
 * @author Paulo Maio <pam@isep.ipp.pt>
 * @author Miguel Jordão <1201477@isep.ipp.pt>
 * @author Mariana Lages <@isep.ipp.pt>
 * @author Lucas Silva <@isep.ipp.pt>
 * @author Daniel Costa <@isep.ipp.pt>
 * @author Marcin Basinki <@isep.ipp.pt>
 */
public class Company {

    private String designation;
    private AuthFacade authFacade;

    TestTypeStore testTypeStore = new TestTypeStore();

    private static TestTypeStore testTypeList;

    public static TestTypeStore TestType(){
        return testTypeList = new TestTypeStore();
    }

    //public List<TestType> getTestType(){return testTypeStore.getTt();}

    public boolean addTestType(TestType tt){
        testTypeStore.listAdd(tt);
        return true;
    }

    //public List

    public boolean validateTestType(TestType tt){
        testTypeStore.ValidateTestType(tt);
        return true;
    }

    public boolean saveTestType(TestType tt){
        testTypeStore.saveTestType();
        return true;
    }

    public boolean listContainsTestType(TestType tt){
        testTypeStore.listContain(tt);
        return true;
    }

    public boolean listAdd(TestType tt){
        testTypeStore.listAdd(tt);
        return true;
    }

    public TestType getTestType(int i){
       return testTypeStore.getTestType(i);
    }

    public TestType getTt() {
        return testTypeStore.tt;
    }

    public Company(String designation)
    {
        if (StringUtils.isBlank(designation))
            throw new IllegalArgumentException("Designation cannot be blank.");

        this.designation = designation;
        this.authFacade = new AuthFacade();
    }

    public String getDesignation() {
        return designation;
    }

    public AuthFacade getAuthFacade() {
        return authFacade;
    }

    public TestType createTestType(String testCode,String description, String collectingMethod){
        return new TestType(testCode,description,collectingMethod);
    }

}
