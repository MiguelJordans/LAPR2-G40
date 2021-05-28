package app.domain.model;

import app.domain.shared.Constants;
import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

public class Employee {

    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    private String orgRole;
    private String employeeId;
    private String socCode;

    private EmployeeCheck eC;

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

        eC.checkNameRules(name);
        eC.checkAddressRules(address);
        eC.checkEmailRules(email);
        eC.checkPhoneNumberRules(phoneNumber);
        eC.checkEmployeeId(employeeId);
        eC.checkSocCode(socCode);
        eC.checkOrgRole(orgRole);

        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.employeeId = employeeId;
        this.socCode = socCode;
        this.orgRole = orgRole;


    }

    //Gets

    /**
     * Returns the organization role of the Employee
     *
     * @return the organization role of the Employee
     */

    public String getOrgRole() {
        return orgRole;
    }

    /**
     * Returns the name of the Employee
     *
     * @return the name of the Employee
     */

    public String getName() {
        return name;
    }

    /**
     * Returns the address of the Employee
     *
     * @return the address of the Employee
     */

    public String getAddress() {
        return address;
    }

    /**
     * Returns the email of the Employee
     *
     * @return the email of the Employee
     */

    public String getEmail() {
        return email;
    }

    /**
     * Returns the phone number of the Employee
     *
     * @return the phone number of the Employee
     */

    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Returns the ID of the Employee
     *
     * @return the ID of the Employee
     */

    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * Returns the Soc code of the Employee
     *
     * @return the Soc code of the Employee
     */

    public String getSocCode() {
        return socCode;
    }

    //Sets

    /**
     * Modifies the organization role
     *
     * @param orgRole modifies the organization role of the Employee
     */

    public void setOrgRole(String orgRole) {
        this.orgRole = orgRole;
    }

    /**
     * Modifies the name
     *
     * @param name modifies the name of the Employee
     */


    public void setName(String name) {
        this.name = name;
    }

    /**
     * Modifies the address
     *
     * @param address modifies the address of the Employee
     */


    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Modifies the email
     *
     * @param email modifies the email of the Employee
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Modifies the phone number
     *
     * @param phoneNumber the phone number of the Employee
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Modifies the Employee ID
     *
     * @param employeeId the ID of the Employee
     */

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * Modifies the Soc code
     *
     * @param socCode the Soc code of the Employee
     */

    public void setSocCode(String socCode) {
        this.socCode = socCode;
    }

    /**
     * Returns the textual description of the Employee in the formate : name, address, phoneNumber, email, orgRole, employeeId, socCode, doctorIndexNumber.
     *
     * @return
     */


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", orgRole='" + orgRole + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", socCode='" + socCode + '\'' +
                '}';
    }
}
