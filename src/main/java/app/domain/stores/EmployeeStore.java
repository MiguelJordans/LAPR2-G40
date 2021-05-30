package app.domain.stores;

import app.domain.model.Company;
import app.domain.model.Employee;
import app.domain.model.EmployeeUserInformation;
import app.ui.console.GeneratePassword;
import auth.AuthFacade;

import java.util.ArrayList;
import java.util.List;

public class EmployeeStore {

    List<Employee> employeeList;
    Employee emp;

    private GeneratePassword gp = new GeneratePassword();
    private EmployeeUserInformation ei = new EmployeeUserInformation();

    private static int employeeN;

    /**
     * Constructor
     */
    public EmployeeStore() {
        this.employeeList = new ArrayList<>();
    }

    /**
     * Creates an instance of an Employee.
     *
     * @param name        - the Employee's name
     * @param address     - the Employee's address
     * @param email       - the Employee's email
     * @param phoneNumber - the Employee's phone number
     * @param socCode     - the Employee's SOC Code
     * @param orgRole     - the Employee's organization role
     */

    public Employee newEmployee(String name, String address, String email, String phoneNumber, String socCode, String orgRole) {

        String iD = generateEmployeeID(name);

        this.emp = new Employee(name, address, email, phoneNumber, iD, socCode, orgRole);

        return this.emp;
    }

    /**
     * Validates an instance of an Employee.
     *
     * @param emp - the object Employee
     * @return the validation of the Employee being created
     */

    public boolean validateEmployee(Employee emp) {

        if (emp == null || listContain(emp)) {
            return false;
        }
        return true;

    }

    /**
     * Checks if the new object Employee is already in the list.
     *
     * @param emp - the object Employee
     * @return true if the list contains the Employee and false if it doesn't
     */

    public boolean listContain(Employee emp) {
        if (this.employeeList.contains(emp)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Saves an instance of Employee
     *
     * @return the saving of an instance of a Employee
     */

    public boolean saveEmployee() {
        if (validateEmployee(this.emp)) {
            listAdd(emp);
            return true;
        } else {
            return false;
        }

    }

    /**
     * Adds an instance of Employee to the list
     *
     * @param emp - the object Employee
     * @return the addition of Employee to the list
     */

    public boolean listAdd(Employee emp) {
        employeeList.add(emp);
        return true;
    }


    /**
     * Replaces the element at the specified position in the list with the specified element.
     *
     * @param i - the index of the element to replace
     * @return the element previously at the specified position
     */

    public Employee getEmployee(int i) {
        return employeeList.get(i);
    }


    /**
     * Gets Employee from the list.
     *
     * @return the Employee requested
     */

    public Employee getEmp() {
        return emp;
    }


    /**
     * Gets the employee List
     *
     * @return the employee list
     */

    public List<Employee> getEmployeeList() {
        return this.employeeList;
    }

    /**
     * Generates the employee ID
     *
     * @param name the name of the employee
     * @return the ID created for the employee
     */

    public String generateEmployeeID(String name) {

        String employeID;
        StringBuilder chars = new StringBuilder();

        String[] idName = name.split("");

        for (String s : idName) {
            chars.append(s.charAt(0));
        }
        employeID = chars + String.format("%05d", employeeN);

        return employeID;
    }

    /**
     * Generates the file with the employee user information
     *
     * @param name    the name of the client
     * @param email   the email of the client
     * @param role    the role of the client
     * @param company the geral company
     */

    public void generateUserInformation(String name, String email, String role, Company company) {

        gp.password();

        String password = gp.getPassword();

        ei.generateEmployeeInformation(name, email, password, role);

        AuthFacade cc = company.getAuthFacade();

        if (!cc.existsUser(email)) {
            cc.addUserWithRole(name, email, password, role);
        }

        System.out.println("Employee information: " + role + "\nEmail: " + email + "\nPassword: " + password);

    }
}
