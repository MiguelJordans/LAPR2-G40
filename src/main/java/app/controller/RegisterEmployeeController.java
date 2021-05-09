package app.controller;

import app.domain.EmployeeStore;
import app.domain.Company;
import auth.AuthFacade;


public class RegisterEmployeeController {

    private Company company;
    private EmployeeStore store;

    /**
     * Creates an empty Register Employee controller.
     */

    public RegisterEmployeeController() {
        this(App.getInstance().getCompany());
    }

    /**
     * Instance of a New Employee.
     *
     * @param company - the company that administrates the system
     */

    public RegisterEmployeeController(Company company) {this.company = company;}


    /**
     * Creates an instance of an Employee.
     *
     * @param name                   - the Employee's name
     * @param address                - the Employee's address
     * @param email                  - the Employee's email
     * @param phoneNumber            - the Employee's phone number
     * @param employeeId             - the Employee's ID
     * @param socCode                - the Employee's SOC Code
     * @param orgRole                - the Employee's organization role
     * @param doctorIndexNumber      - the Specialist Doctor Doctor Index Number
     */


    public void Employee(String name, String address, String email, String phoneNumber, String employeeId, String socCode, String orgRole, String doctorIndexNumber){
        store = company.getEmployeeStore();
        store.NewEmployee(name, address, email, phoneNumber, employeeId, socCode, orgRole, doctorIndexNumber);
    }


    /**
     * Transforms into string.
     *
     * @return the Employee's info in string format
     */

    public String getEmp() { return store.getEmp().toString();}


    /**
     * Saves an instance of an Employee.
     *
     * @return the saving of an Employee
     */

    public boolean SaveEmployee() { return this.store.saveEmployee();}


}
