package app.controller;

import app.domain.EmployeeStore;
import auth.mappers.dto.EmployeeDto;
import app.domain.Company;
import auth.AuthFacade;


public class RegisterEmployeeController {

    private Company company;
    private EmployeeStore store;

    /**
     * Creates an empty Clinical Analysis Laboratory controller.
     */

    public RegisterEmployeeController() {
        this(App.getInstance().getCompany());
    }

    /**
     * Instance of a ParameterCategory.
     *
     * @param company - the company that administrates the system
     */

    public RegisterEmployeeController(Company company) {this.company = company;}



    public void Employee(String name, String address, String email, String phoneNumber, String employeeId, String socCode, String orgRole, String doctorIndexNumber){
        store = company.getEmployeeStore();
        store.NewEmployee(name, address, email, phoneNumber, employeeId, socCode, orgRole, doctorIndexNumber);
    }


    public String getEmp() { return store.getEmp().toString();}

    public boolean SaveEmployee() { return this.store.saveEmployee();}


}
