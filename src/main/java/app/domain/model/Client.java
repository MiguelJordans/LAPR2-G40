package app.domain.model;

import app.domain.shared.Constants;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.regex.Pattern;

public class Client {

    /**
     * Private Atributes that are only directly access in this class.
     */

    private String name;
    private String email;
    private String sex;
    private Date birthdate;
    private String citizenCardNumber;
    private String phoneNumber;
    private String tinNumber;
    private String nhsNumber;


    /**
     * Constructs an instance of Client.
     *
     * @param name              - the Client's name.
     * @param email             - the Client's email.
     * @param sex               - the Client's sex.
     * @param birthdate         - the Client's birth date.
     * @param citizenCardNumber - the Client's citizen card number.
     * @param phoneNumber       - the Client's phone number.
     * @param tinNumber         - the Client's TIN number.
     * @param nhsNumber         - the Client's NHS number.
     */


    public Client(String name, String email, String sex, Date birthdate, String citizenCardNumber, String phoneNumber, String tinNumber, String nhsNumber) {

        checkNameRules(name);
        checkEmailRules(email);
        checkSexRules(sex);
        checkBirthdateRules(birthdate);
        checkCitizenCardNumberRules(citizenCardNumber);
        checkPhoneNumberRules(phoneNumber);
        checkTINNumberRules(tinNumber);
        checkNHSNumberRules(nhsNumber);

        this.name = name;
        this.email = email;
        this.sex = sex;
        this.birthdate = birthdate;
        this.citizenCardNumber = citizenCardNumber;
        this.phoneNumber = phoneNumber;
        this.tinNumber = tinNumber;
        this.nhsNumber = nhsNumber;


    }

    //  Get Methods --------------------------------------------------------------------

    /**
     * Returns the name of the Client.
     *
     * @return the name of the Client.
     */

    public String getName() {
        return name;
    }

    /**
     * Returns the email of the Client.
     *
     * @return the email of the Client.
     */

    public String getEmail() {
        return email;
    }

    /**
     * Returns the sex of the Client.
     *
     * @return the sex of the Client.
     */

    public String getSex() {
        return sex;
    }

    /**
     * Returns the birth date of the Client.
     *
     * @return the birth date of the Client.
     */

    public Date getBirthdate() {
        return birthdate;
    }

    /**
     * Returns the citizen card number of the Client.
     *
     * @return the citizen card number of the Client.
     */

    public String getCitizenCardNumber() {
        return citizenCardNumber;
    }

    /**
     * Returns the phone number of the Client.
     *
     * @return the phone number of the Client.
     */

    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Returns the TIN number of the Client.
     *
     * @return the TIN number of the Client.
     */

    public String getTinNumber() {
        return tinNumber;
    }

    /**
     * Returns the NHS number of the Client.
     *
     * @return the NHS number of the Client.
     */

    public String getNhsNumber() {
        return nhsNumber;
    }


    //  Set Methods -------------------------------------------------------------------


    /**
     * Modifies the name of the Client.
     *
     * @param name - the Client's name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Modifies the email of the Client.
     *
     * @param email - the Client's email.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Modifies the sex of the Client.
     *
     * @param sex - the Client's sex.
     */

    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * Modifies the birth date of the Client.
     *
     * @param birthdate - the Client's birth date.
     */

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * Modifies the citizen card number of the Client.
     *
     * @param citizenCardNumber - the Client's citizen card number.
     */

    public void setCitizenCardNumber(String citizenCardNumber) {
        this.citizenCardNumber = citizenCardNumber;
    }

    /**
     * Modifies the phone number of the Client.
     *
     * @param phoneNumber - the Client's phone number.
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Modifies the TIN number of the Client.
     *
     * @param tinNumber - the Client's TIN number.
     */

    public void setTinNumber(String tinNumber) {
        this.tinNumber = tinNumber;
    }

    /**
     * Modifies the NHS number of the Client.
     *
     * @param nhsNumber - the Client's NHS number.
     */

    public void setNhsNumber(String nhsNumber) {
        this.nhsNumber = nhsNumber;
    }


    //  Check Methods ---------------------------------------------------------------------

    /**
     * Checks the Client's name rules.
     *
     * @param name - the Client's name.
     */

    private void checkNameRules(String name) {

        String aux = name.trim();
        aux = aux.toLowerCase();
        char[] auxchar = aux.toCharArray();

        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        if ((name.length() >= Constants.NAME_MAX1)) {
            throw new IllegalArgumentException("Name cannot have more than 35 characters.");
        }
        for (int i = 0; i < auxchar.length; i++) {
            char ch = auxchar[i];
            if (!(ch >= 'a' && ch <= 'z')) {
                throw new IllegalArgumentException("Invalid name.");
            }
        }

    }

    /**
     * Checks the Client's email rules.
     *
     * @param email - the Client's email.
     */

    private void checkEmailRules(String email) {

        if (StringUtils.isBlank(email)) {
            throw new IllegalArgumentException("Email cannot be empty.");
        }

        /**
         *  @Author of this check rules in lines (247-253): Paulo Maio.
         */

        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);

        if (!pat.matcher(email).matches()) {
            throw new IllegalArgumentException("Invalid Email format.");
        }

    }

    /**
     * Checks the Client's sex rules.
     *
     * @param sex - the Client's sex.
     */

    private void checkSexRules(String sex) {

        if (StringUtils.isBlank(sex)) {
            throw new IllegalArgumentException("Sex cannot be empty.");
        }

        if (!(sex.equalsIgnoreCase("Male") || sex.equalsIgnoreCase("Female") || sex.equalsIgnoreCase("Other"))) {
            throw new IllegalArgumentException("Invalid sex");
        }

    }

    /**
     * Calculate the age of the client
     *
     * @param birthdate - Client birth date (xx/yy/zzz)
     * @return - age of the client
     */

    private int calculateAge(Date birthdate) {
        LocalDate date = birthdate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return Period.between(date, LocalDate.now()).getYears();
    }

    /**
     * Check if birth date respects the acceptance criteria
     *
     * @param birthdate - Client birth date (xx/yy/zzz)
     */

    private void checkBirthdateRules(Date birthdate) {
        int age = calculateAge(birthdate);

        if (age < Constants.MIN_CLIENT_AGE) {
            throw new IllegalArgumentException("Age cannot be negative");
        }

        if (age > Constants.MAX_CLIENT_AGE) {
            throw new IllegalArgumentException("Age cannot be superior of 150 years");
        }
    }

    /**
     * Checks the Client's citizen card number rules.
     *
     * @param citizenCardNumber - the Client's citizen card number.
     */

    private void checkCitizenCardNumberRules(String citizenCardNumber) {

        String auxStrCitizenCardNumber = citizenCardNumber.replaceAll("\\s", "");
        char[] auxchar = auxStrCitizenCardNumber.toCharArray();

        if (StringUtils.isBlank(auxStrCitizenCardNumber)) {
            throw new IllegalArgumentException("Citizen card number cannot be empty.");
        }
        if (auxStrCitizenCardNumber.length() != Constants.CITIZEN_NUMBER_CARD_MAX) {
            throw new IllegalArgumentException("Citizen card number must have 16 digit numbers.");
        }

        for (int i = 0; i < auxchar.length; i++) {
            char ch = auxchar[i];
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                throw new IllegalArgumentException("Invalid Citizen Card Number.");
            }
        }

    }

    /**
     * Checks the Client's phone number rules.
     *
     * @param phoneNumber - the Client's phone number.
     */

    private void checkPhoneNumberRules(String phoneNumber) {

        String auxStrPhoneNumber = phoneNumber.replaceAll("\\s", "");
        char[] auxchar = auxStrPhoneNumber.toCharArray();

        if (StringUtils.isBlank(auxStrPhoneNumber)) {
            throw new IllegalArgumentException("Phone number cannot be empty.");
        }
        if (auxStrPhoneNumber.length() != Constants.PHONE_NUMBER_MAX) {
            throw new IllegalArgumentException("Phone number must have 11 digit numbers.");
        }

        for (int i = 0; i < auxchar.length; i++) {
            char ch = auxchar[i];
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                throw new IllegalArgumentException("Invalid Phone Number.");
            }
        }

    }

    /**
     * Checks the Client's TIN number rules.
     *
     * @param tinNumber - the Client's TIN number.
     */

    private void checkTINNumberRules(String tinNumber) {

        String auxStrTINnumber = tinNumber.replaceAll("\\s", "");
        char[] auxchar = auxStrTINnumber.toCharArray();

        if (StringUtils.isBlank(auxStrTINnumber)) {
            throw new IllegalArgumentException("TIN number cannot be empty.");
        }
        if (auxStrTINnumber.length() != Constants.TIN_NUMBER_SIZE) {
            throw new IllegalArgumentException("TIN number must have 10 digit numbers.");
        }

        for (int i = 0; i < auxchar.length; i++) {
            char ch = auxchar[i];
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                throw new IllegalArgumentException("Invalid TIN Number.");
            }
        }

    }

    /**
     * Checks the Client's NHS number rules.
     *
     * @param nhsNumber - the Client's NHS number.
     */

    private void checkNHSNumberRules(String nhsNumber) {

        String auxStrNHSnumber = nhsNumber.replaceAll("\\s", "");
        char[] auxchar = auxStrNHSnumber.toCharArray();

        if (StringUtils.isBlank(auxStrNHSnumber)) {
            throw new IllegalArgumentException("TIN number cannot be empty.");
        }
        if (auxStrNHSnumber.length() != Constants.NHSLD_MAX) {
            throw new IllegalArgumentException("TIN number must have 10 digit numbers.");
        }

        for (int i = 0; i < auxchar.length; i++) {
            char ch = auxchar[i];
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                throw new IllegalArgumentException("Invalid NHS Number.");
            }
        }

    }

    /**
     * Returns the textual description of the Client in the format: name, email,
     * sex, birth date, citizen card number, phone number, TIN number. NHS number.
     *
     * @return
     */

    @Override
    public String toString() {
        return "Client: " + name + ", Email: " + email + ", Sex: " + sex + ", Birth date: " + birthdate +
                ", Citizen Card Number: " + citizenCardNumber + ", Phone Number: " + phoneNumber +
                ", TIN Number: " + tinNumber + ", NHS Number: " + nhsNumber;
    }
}
