package app.domain.model;

import app.domain.shared.Constants;
import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

public class EmployeeSuper {

    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    private String orgRole;
    private String employeeId;
    private String socCode;


    /**
     * Contructor.
     *
     * @param name        the Employee's name
     * @param address     the Employee's address
     * @param email       the Employee's email
     * @param phoneNumber the Employee's phone number
     * @param employeeId  the Employee's ID
     * @param socCode     the Employee's SOC code
     * @param orgRole     the Employee's organization role
     */
    public EmployeeSuper(String name, String address, String email, String phoneNumber, String employeeId, String socCode, String orgRole) {

        checkNameRules(name);
        checkAddressRules(address);
        checkEmailRules(email);
        checkPhoneNumberRules(phoneNumber);
        checkEmployeeId(employeeId);
        checkSocCode(socCode);
        checkOrgRole(orgRole);

        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.employeeId = employeeId;
        this.socCode = socCode;
        this.orgRole = orgRole;
    }

    /**
     * Checks the Employee's organization role (according to the acceptance criteira)
     *
     * @param orgRole the the Employee's ordanization role
     */
    public void checkOrgRole(String orgRole) {

        if (StringUtils.isBlank(orgRole)) {
            throw new IllegalArgumentException("Organization role cannot be empty.");
        }
    }

    /**
     * Checks the Employee's name rules (according to the acceptance criteria)
     *
     * @param name the Employee's name
     */
    public void checkNameRules(String name) {

        String aux = name.trim();
        aux = aux.toLowerCase();
        char[] auxchar = aux.toCharArray();

        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        if ((name.length() >= Constants.NAME_EMPLOYEE_MAX)) {
            throw new IllegalArgumentException("Name cannot have more than 30 characters.");
        }
        for (int i = 0; i < auxchar.length; i++) {
            char ch = auxchar[i];
            if (!(ch >= 'a' && ch <= 'z')) {
                throw new IllegalArgumentException("Invalid name.");
            }
        }
    }

    /**
     * Checks the Employee's address (according to the acceptance criteira)
     *
     * @param address the Employee's address
     */
    public void checkAddressRules(String address) {
        String aux = address.trim();
        aux = aux.toLowerCase();

        if (StringUtils.isBlank(address)) {
            throw new IllegalArgumentException("Address cannot be empty.");
        }

        if ((aux.length() > Constants.ADDRESS_EMPLOYEE_MAX)) {
            throw new IllegalArgumentException("Address cannot have more than 30 characters.");
        }
    }

    /**
     * Checks the Employee's email (according to the acceptance criteira)
     *
     * @param email the Employee's mail
     */
    public void checkEmailRules(String email) {

        if (email.equals("")) {
            throw new IllegalArgumentException("Email cannot be empty.");
        }

        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);

        if (!pat.matcher(email).matches()) {
            throw new IllegalArgumentException("Invalid Email format.");
        }
    }

    /**
     * Checks the Employee's phone number (according to the acceptance criteira)
     *
     * @param phoneNumber the Employee's phone number
     */
    public void checkPhoneNumberRules(String phoneNumber) {
        String auxTrimPhoneNumber = phoneNumber.replaceAll("\\s", "");
        char[] auxChar = auxTrimPhoneNumber.toCharArray();

        if (StringUtils.isBlank(phoneNumber)) {
            throw new IllegalArgumentException("Phone number cannot be blank.");
        }
        if ((phoneNumber.length() != Constants.PHONE_NUMBER_MAX)) {
            throw new IllegalArgumentException("Phone number must be 11 digit numbers.");
        }
        for (int i = 0; i < auxChar.length; i++) {
            char ch = auxChar[i];
            if (ch >= 'a' && ch <= 'z') {
                throw new IllegalArgumentException("Invalid phone number! Try using only numbers.");
            }
        }
    }

    /**
     * Checks the Employee's employee ID (according to the acceptance criteira)
     *
     * @param employeeId the Employee's ID
     */
    public void checkEmployeeId(String employeeId) {

        String auxEmployeeId = employeeId.replaceAll("\\s", "");

        if (StringUtils.isBlank(auxEmployeeId)) {
            throw new IllegalArgumentException("Employee ID cannot be empty.");
        }
        if ((auxEmployeeId.length() == Constants.EMPLOYEE_ID)) {
            throw new IllegalArgumentException("Employee ID has an invalid format.");
        }
    }

    /**
     * Checks the Employee's Soc Code (according to the acceptance criteria)
     *
     * @param socCode the Employee's soc Code
     */
    public void checkSocCode(String socCode) {

        String auxSocCode = socCode.replaceAll("\\s", "");
        char[] auxchar = auxSocCode.toCharArray();

        if (StringUtils.isBlank(socCode)) {
            throw new IllegalArgumentException("SOC code cannot be empty.");
        }
        if ((auxSocCode.length() != Constants.SOC_MAX)) {
            throw new IllegalArgumentException("SOC code must have 7 digits.");
        }

        for (int i = 0; i < auxchar.length; i++) {
            char ch = auxchar[i];
            if (ch >= 'a' && ch <= 'z') {
                throw new IllegalArgumentException("Invalid Soc Code.");
            }
        }
    }

    //Gets ----------------------------------------------------------------------------

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

    //Sets ----------------------------------------------------------------------------

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
