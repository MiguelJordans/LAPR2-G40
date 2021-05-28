package app.domain.model;

public class Employee extends EmployeeSuper {

    /**
     * Contructs an instance of Employee
     *
     * @param name the Employee's name
     * @param address the Employee's adress
     * @param email the Employee's email
     * @param phoneNumber the Employee's phone number
     * @param employeeId the Employee's employee ID
     * @param socCode the Employee's socCode
     * @param orgRole the Employee's organization role
     */

    public Employee(String name, String address, String email, String phoneNumber, String employeeId, String socCode, String orgRole) {

        super(name,address,email,phoneNumber,employeeId,socCode,orgRole);

    }

}
