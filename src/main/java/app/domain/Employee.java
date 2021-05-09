package app.domain;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

public class Employee {

    private String name, address, phoneNumber, email, orgRole;
    private String employeeId;
    private String socCode, doctorIndexNumber;


    public Employee(String name, String address, String email, String phoneNumber, String employeeId, String socCode, String orgRole, String doctorIndexNumber) {

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
    public void checkDoctorIndexNumber(String doctorIndexNumber) {

        if (StringUtils.isBlank(doctorIndexNumber)) {
            throw new IllegalArgumentException("Doctor Index Number can't be empty.");
        }
        if (doctorIndexNumber.length() != 6) {
            throw new IllegalArgumentException("Doctor Index Number needs to have exactly 6 digits.");
        }

    }

    public void checkOrgRole(String orgRole) {

        String aux = orgRole.trim();
        aux = aux.toLowerCase();

        if (StringUtils.isBlank(orgRole)) {
            throw new IllegalArgumentException("Organization role cannot be empty.");
        }
        if (!((aux.equalsIgnoreCase("specialistdoctor")) || (aux.equalsIgnoreCase("employee")))) {
            throw new IllegalArgumentException("Please select between \"employee\" and \"specialist doctor\".");
        }

    }


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

    public void checkAddressRules(String address) {
        String aux = address.trim();
        aux = aux.toLowerCase();

        if (StringUtils.isBlank(address)) {
            throw new IllegalArgumentException("Address cannot be empty.");
        }

        if (!(aux.length() <= 30)) {
            throw new IllegalArgumentException("Address cannot have more than 30 characters.");
        }

    }

    public void checkEmailRules(String email) {

        if (StringUtils.isBlank(email)) {
            throw new IllegalArgumentException("Email cannot be empty.");
        }

        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);

        if (!pat.matcher(email).matches()) {
            throw new IllegalArgumentException("Invalid Email format.");
        }

    }

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

    public void checkEmployeeId(String employeeId) {


        String auxEmployeeId = employeeId.replaceAll("\\s", "");

        if (StringUtils.isBlank(auxEmployeeId)) {
            throw new IllegalArgumentException("Employee ID cannot be empty.");
        }
        if (!(auxEmployeeId.length() == 9)) {
            throw new IllegalArgumentException("Employee ID has an invalid format.");
        }

    }

    public void checkSocCode(String socCode) {

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

    //Sets
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

    public void setSocCode(String socCode) {
        this.socCode = socCode;
    }

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
}
