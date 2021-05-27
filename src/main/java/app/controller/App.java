package app.controller;

import app.domain.model.*;
import app.domain.shared.Constants;
import auth.AuthFacade;
import auth.UserSession;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 *
 * @author Paulo Maio <pam@isep.ipp.pt>
 */
public class App {

    private final Company company;
    private final AuthFacade authFacade;

    private App()
    {
        Properties props = getProperties();
        this.company = new Company(props.getProperty(Constants.PARAMS_COMPANY_DESIGNATION));
        this.authFacade = this.company.getAuthFacade();
        bootstrap();
    }

    public Company getCompany()
    {
        return this.company;
    }


    public UserSession getCurrentUserSession()
    {
        return this.authFacade.getCurrentUserSession();
    }

    public boolean doLogin(String email, String pwd)
    {
        return this.authFacade.doLogin(email,pwd).isLoggedIn();
    }

    public void doLogout()
    {
        this.authFacade.doLogout();
    }

    private Properties getProperties()
    {
        Properties props = new Properties();

        // Add default properties and values
        props.setProperty(Constants.PARAMS_COMPANY_DESIGNATION, "Many Labs");


        // Read configured values
        try
        {
            InputStream in = new FileInputStream(Constants.PARAMS_FILENAME);
            props.load(in);
            in.close();
        }
        catch(IOException ex)
        {

        }
        return props;
    }


    private void bootstrap()
    {
        this.authFacade.addUserRole(Constants.ROLE_ADMIN,Constants.ROLE_ADMIN);
        this.authFacade.addUserRole(Constants.ROLE_RECEPTIONIST,Constants.ROLE_RECEPTIONIST);
        this.authFacade.addUserRole(Constants.ROLE_MEDICAL_LAB_TECHNICIAN,Constants.ROLE_MEDICAL_LAB_TECHNICIAN);
        this.authFacade.addUserRole(Constants.ROLE_CLINICAL_CHEMISTRY_TECHNOLOGIST,Constants.ROLE_CLINICAL_CHEMISTRY_TECHNOLOGIST);

        this.authFacade.addUserWithRole("Main Administrator", "admin@lei.sem2.pt", "123456",Constants.ROLE_ADMIN);
        this.authFacade.addUserWithRole("Miguel Jordão", "1201487@lei.sem2.pt", "123456",Constants.ROLE_ADMIN);
        this.authFacade.addUserWithRole("Mariana Lages", "1200902@lei.sem2.pt", "123456",Constants.ROLE_ADMIN);
        this.authFacade.addUserWithRole("Daniel Costa", "1200581@lei.sem2.pt", "123456",Constants.ROLE_ADMIN);
        this.authFacade.addUserWithRole("Lucas Silva", "1200759@lei.sem2.pt", "123456",Constants.ROLE_ADMIN);
        this.authFacade.addUserWithRole("Recepcionist", "receptionist@lei.sem2.pt", "123456",Constants.ROLE_RECEPTIONIST);
        this.authFacade.addUserWithRole("Medical lab technician", "mlt@lei.sem2.pt", "123456",Constants.ROLE_MEDICAL_LAB_TECHNICIAN);
        this.authFacade.addUserWithRole("Clinical Chemistry Technologist", "cct@lei.sem2.pt", "123456",Constants.ROLE_CLINICAL_CHEMISTRY_TECHNOLOGIST);

        TestTypeStore testTypeStore = company.getTestTypeStore();
        ParameterCategoryStore parameterCategoryStore = company.getParameterCategoryStore();
        ParameterStore parameterStore = company.getParameterStore();
        TestStore testStore = company.getTestStore();

        ParameterCategory parameterCategory = new ParameterCategory("12345", "categoria","1212");
        parameterCategoryStore.saveParameterCategory();
        parameterCategoryStore.getParameterCategoryList().add(parameterCategory);
        ParameterCategory parameterCategory1 = new ParameterCategory("12346", "cat","1212");
        parameterCategoryStore.saveParameterCategory();
        parameterCategoryStore.getParameterCategoryList().add(parameterCategory1);

        List<ParameterCategory> categories1 = new ArrayList<>();
        categories1.add(parameterCategory);
        List<ParameterCategory> categories2 = new ArrayList<>();
        categories2.add(parameterCategory1);

        TestType bloodTest = new TestType("BL000", "Blood Test", "Needle", categories2);
        testTypeStore.saveTestType();
        testTypeStore.getTestTypeList().add(bloodTest);
        TestType covidTest = new TestType("COV19", "Covid Test", "Swap", categories1);
        testTypeStore.saveTestType();
        testTypeStore.getTestTypeList().add(covidTest);

        Parameter p1 = new Parameter("IgGAN","000","paramCv1",categories1);
      //  parameterStore.CreateParameter("IgGAN","000","paramCv1",categories1);
        parameterStore.saveParameter();
        parameterStore.getParameterList().add(p1);
        Parameter p2 = new Parameter("ESR00", "aaa", "paramBl1", categories1);
       // parameterStore.CreateParameter("ESR00", "aaa", "paramBl1", categories1);
        parameterStore.saveParameter();
        parameterStore.getParameterList().add(p2);
        Parameter p3 = new Parameter("HB000", "bbb", "paramBl2", categories2);
       // parameterStore.CreateParameter("HB000", "bbb", "paramBl2", categories2);
        parameterStore.saveParameter();
        parameterStore.getParameterList().add(p3);

        Test test = new Test("1234567890123456", "100000000000", "999999999999", bloodTest);
        //testStore.getTestList().add(test);
        //testStore.saveTest(test);
        Test test1 = new Test("1234567890123456", "100000000001", "999999999991", covidTest);
        //testStore.getTestList().add(test1);
        //testStore.saveTest(test1);

    }

    // Extracted from https://www.javaworld.com/article/2073352/core-java/core-java-simply-singleton.html?page=2
    private static App singleton = null;
    public static App getInstance()
    {
        if(singleton == null)
        {
            synchronized(App.class)
            {
                singleton = new App();
            }
        }
        return singleton;
    }
}
