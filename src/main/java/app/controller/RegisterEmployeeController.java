package app.controller;

import app.domain.model.Employee;
import app.domain.model.EmployeeStore;
import app.domain.model.Company;

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
     * @param socCode                - the Employee's SOC Code
     * @param orgRole                - the Employee's organization role
     */


    public void Employee(String name, String address, String email, String phoneNumber, String socCode, String orgRole){
        store = company.getEmployeeStore();
        store.newEmployee(name, address, email, phoneNumber, socCode, orgRole);
    }

    /**
     * Transforms into string.
     *
     * @return the Employee's info in string format
     */

    public Employee getEmp() { return store.getEmp();}

    /**
     * Saves an instance of an Employee.
     *
     * @return the saving of an Employee
     */

    public boolean SaveEmployee() { return this.store.saveEmployee();}

    public void generateUserInformation(String name, String email,String role) {

        store.generateUserInformation(name,email,role);

    }
}