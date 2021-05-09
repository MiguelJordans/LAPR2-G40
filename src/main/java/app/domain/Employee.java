package app.domain;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

public class Employee {

    private String name, address, phoneNumber, email, orgRole;
    private String employeeId;
    private String socCode, doctorIndexNumber;


<<<<<<< HEAD
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

    public Employee (String name, String address, String email, String phoneNumber, String employeeId, String socCode, String orgRole, String doctorIndexNumber){
=======
    public Employee(String name, String address, String email, String phoneNumber, String employeeId, String socCode, String orgRole, String doctorIndexNumber) {
>>>>>>> 8f1b4ca68415a3cd92bfee29e722351925694e8a

        checkNameRules(name);
        checkAddressRules(address);
        checkEmailRules(email);
        checkPhoneNumberRules(phoneNumber);
        checkEmployeeId(employeeId);
        checkSocCode(socCode);
        checkOrgRole(orgRole);
        checkDoctorIndexNumber(doctorIndexNumber);

        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.employeeId = employeeId;
        this.socCode = socCode;
        this.orgRole = orgRole;
        this.doctorIndexNumber = doctorIndexNumber;
    }

    //Checks
<<<<<<< HEAD

    /**
     * Checks the Doctor Index Number rules
     *
     * @param doctorIndexNumber  - the Specialist Doctor Doctor Index Number
     *
     */
    public void checkDoctorIndexNumber (String doctorIndexNumber){
=======
    public void checkDoctorIndexNumber(String doctorIndexNumber) {
>>>>>>> 8f1b4ca68415a3cd92bfee29e722351925694e8a

        if (StringUtils.isBlank(doctorIndexNumber)) {
            throw new IllegalArgumentException("Doctor Index Number can't be empty.");
        }
        if (doctorIndexNumber.length() != 6) {
            throw new IllegalArgumentException("Doctor Index Number needs to have exactly 6 digits.");
        }

    }

<<<<<<< HEAD
    /**
     * Checks the Organization Role rules
     *
     * @param orgRole  - the Employee's organization role
     *
     */

    public void checkOrgRole (String orgRole){
=======
    public void checkOrgRole(String orgRole) {
>>>>>>> 8f1b4ca68415a3cd92bfee29e722351925694e8a

        String aux = orgRole.trim();
        aux = aux.toLowerCase();

        if (StringUtils.isBlank(orgRole)) {
            throw new IllegalArgumentException("Organization role cannot be empty.");
        }
        if (!((aux.equalsIgnoreCase("specialistdoctor")) || (aux.equalsIgnoreCase("employee")))) {
            throw new IllegalArgumentException("Please select between \"employee\" and \"specialist doctor\".");
        }

    }

    /**
     * Checks the Employee's name rules
     *
     * @param name  - the Employee's name rules
     *
     */

    public void checkNameRules(String name) {

        String aux = name.trim();
        aux = aux.toLowerCase();
        char[] auxchar = aux.toCharArray();

        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        if (!(name.length() < 30)) {
            throw new IllegalArgumentException("Name cannot have more than 30 characters.");
        }
        for (int i = 0; i < auxchar.length; i++) {
            char ch = auxchar[i];
            if (!(ch >= 'a' && ch <= 'z')) {
                throw new IllegalArgumentException("Invalid name.");
            }
        }

    }

<<<<<<< HEAD
    /**
     * Checks the Employee's address rules
     *
     * @param address  - the Employee's address rules
     *
     */

    public void checkAddressRules (String address){
=======
    public void checkAddressRules(String address) {
>>>>>>> 8f1b4ca68415a3cd92bfee29e722351925694e8a
        String aux = address.trim();
        aux = aux.toLowerCase();

        if (StringUtils.isBlank(address)) {
            throw new IllegalArgumentException("Address cannot be empty.");
        }

        if (!(aux.length() <= 30)) {
            throw new IllegalArgumentException("Address cannot have more than 30 characters.");
        }

    }

<<<<<<< HEAD
    /**
     * Checks the Employee's email rules
     *
     * @param email  - the Employee's email rules
     *
     */

    public void checkEmailRules(String email){
=======
    public void checkEmailRules(String email) {
>>>>>>> 8f1b4ca68415a3cd92bfee29e722351925694e8a

        if (StringUtils.isBlank(email)) {
            throw new IllegalArgumentException("Email cannot be empty.");
        }

        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);

        if (!pat.matcher(email).matches()) {
            throw new IllegalArgumentException("Invalid Email format.");
        }

    }

    /**
     * Checks the Employee's Phone Number rules
     *
     * @param phoneNumber  - the Employee's phone number rules
     *
     */

    public void checkPhoneNumberRules(String phoneNumber) {
        String auxTrimPhoneNumber = phoneNumber.replaceAll("\\s", "");
        char[] auxChar = auxTrimPhoneNumber.toCharArray();

        if (StringUtils.isBlank(phoneNumber)) {
            throw new IllegalArgumentException("Phone number cannot be blank.");
        }
        if (!(phoneNumber.length() == 11)) {
            throw new IllegalArgumentException("Phone number must be 11 digit numbers.");
        }
        for (int i = 0; i < auxChar.length; i++) {
            char ch = auxChar[i];
            if (ch >= 'a' && ch <= 'z') {
                throw new IllegalArgumentException("Invalid phone number! Try using only numbers.");
            }
        }
    }

<<<<<<< HEAD
    /**
     * Checks the Employee's ID rules
     *
     * @param employeeId  - the Employee's ID rules
     *
     */

    public void checkEmployeeId (String employeeId){
=======
    public void checkEmployeeId(String employeeId) {
>>>>>>> 8f1b4ca68415a3cd92bfee29e722351925694e8a


        String auxEmployeeId = employeeId.replaceAll("\\s", "");

        if (StringUtils.isBlank(auxEmployeeId)) {
            throw new IllegalArgumentException("Employee ID cannot be empty.");
        }
        if (!(auxEmployeeId.length() == 9)) {
            throw new IllegalArgumentException("Employee ID has an invalid format.");
        }

    }

<<<<<<< HEAD
    /**
     * Checks the Employee's SOC Code rules
     *
     * @param socCode  - the Employee's SOC Code rules
     *
     */

    public void checkSocCode (String socCode){
=======
    public void checkSocCode(String socCode) {
>>>>>>> 8f1b4ca68415a3cd92bfee29e722351925694e8a

        String auxSocCode = socCode.replaceAll("\\s", "");
        char[] auxchar = auxSocCode.toCharArray();

        if (StringUtils.isBlank(auxSocCode)) {
            throw new IllegalArgumentException("SOC code cannot be empty.");
        }
        if (!(auxSocCode.length() == 7)) {
            throw new IllegalArgumentException("SOC code must have 7 digits.");
        }


        for (int i = 0; i < auxchar.length; i++) {
            char ch = auxchar[i];
            if (ch >= 'a' && ch <= 'z') {
                throw new IllegalArgumentException("Invalid Soc Code.");
            }
        }

    }
<<<<<<< HEAD



    //Gets


    /**
     * Returns the Doctor Index Number of the Employee.
     *
     * @return the Doctor Index Number of the Employee
     */

    public String getDoctorIndexNumber(){return doctorIndexNumber;}

    /**
     * Returns the Organization Role of the Employee.
     *
     * @return the Organization Role of the Employee
     */

    public String getOrgRole(){return orgRole;}

    /**
     * Returns the Name of the Employee.
     *
     * @return the Name of the Employee
     */

    public String getName(){return name;}

    /**
     * Returns the Address of the Employee.
     *
     * @return the Address of the Employee
     */

    public String getAddress(){return address;}


    /**
     * Returns the Email of the Employee.
     *
     * @return the Email of the Employee
     */

    public String getEmail(){return email;}


    /**
     * Returns the Phone Number of the Employee.
     *
     * @return the Phone Number of the Employee
     */

    public String getPhoneNumber(){return phoneNumber;}


    /**
     * Returns the Employee ID of the Employee.
     *
     * @return the Employee ID of the Employee
     */

    public String getEmployeeId(){return employeeId;}


    /**
     * Returns the SOC Code of the Employee.
     *
     * @return the SOC Code of the Employee
     */

    public String getSocCode(){return socCode;}
=======

    //Gets
    public String getDoctorIndexNumber() {
        return doctorIndexNumber;
    }

    public String getOrgRole() {
        return orgRole;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getSocCode() {
        return socCode;
    }
>>>>>>> 8f1b4ca68415a3cd92bfee29e722351925694e8a


    /**
     * Returns the randomly generated password.
     *
     * @return the randomly generated password.
     */
    private String getPassword() {
        int lenght = 10;

        return RandomStringUtils.randomAlphanumeric(lenght);
    }

    //Sets
<<<<<<< HEAD

    /**
     * Modifies the Specialist Doctor's Doctor Index Number
     *
     * @param doctorIndexNumber      - the Specialist Doctor Doctor Index Number
     */

    public void setDoctorIndexNumber(String doctorIndexNumber){this.doctorIndexNumber = doctorIndexNumber;}

    /**
     * Modifies the employee's organization role
     *
     * @param orgRole      - the employee's organization role
     */

    public void setOrgRole(String orgRole){this.orgRole = orgRole;}


    /**
     * Modifies the employee's name
     *
     * @param name      - the employee's name
     */

    public void setName(String name){this.name = name;}


    /**
     * Modifies the employee's address
     *
     * @param address      - the employee's address
     */

    public void setAddress(String address){this.address = address;}


    /**
     * Modifies the employee's email
     *
     * @param email      - the employee's email
     */

    public void setEmail(String email){this.email = email;}


    /**
     * Modifies the employee's phone number
     *
     * @param phoneNumber      - the employee's phone number
     */

    public void setPhoneNumber(String phoneNumber){this.phoneNumber = phoneNumber;}


    /**
     * Modifies the employee's ID
     *
     * @param employeeId      - the employee's ID
     */

    public void setEmployeeId(String employeeId){this.employeeId = employeeId;}


    /**
     * Modifies the employee's SOC Code
     *
     * @param socCode      - the employee's SOC Code
     */

    public void setSocCode(String socCode){this.socCode = socCode;}
=======
    public void setDoctorIndexNumber(String doctorIndexNumber) {
        this.doctorIndexNumber = doctorIndexNumber;
    }

    public void setOrgRole(String orgRole) {
        this.orgRole = orgRole;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
>>>>>>> 8f1b4ca68415a3cd92bfee29e722351925694e8a

    public void setSocCode(String socCode) {
        this.socCode = socCode;
    }

<<<<<<< HEAD


=======
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
                ", doctorIndexNumber='" + doctorIndexNumber + '\'' +
                '}';
    }
>>>>>>> 8f1b4ca68415a3cd92bfee29e722351925694e8a
}
