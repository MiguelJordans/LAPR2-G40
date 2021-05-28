package app.domain.model;

import app.domain.shared.Constants;
import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

public class EmployeeCheck {

    public EmployeeCheck(){

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

        if ((aux.length() > Constants.ADRESS_EMPLOYEE_MAX)) {
            throw new IllegalArgumentException("Address cannot have more than 30 characters.");
        }

    }

    /**
     * Checks the Employee's email (according to the acceptance criteira)
     *
     * @param email the Employee's mail
     */

    public void checkEmailRules(String email) {

        if (email==""||email==null) {
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
        if ((auxEmployeeId.length() == 9)) {
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

        if (StringUtils.isBlank(auxSocCode)) {
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

}
