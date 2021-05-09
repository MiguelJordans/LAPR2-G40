package app.domain;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

public class ClientRegistration {

    private String name;
    private String email;
    private String sex;
    private String birthdate;
    private String citizenCardNumber;
    private String phoneNumber;
    private String tinNumber;
    private String nhsNumber;


    public ClientRegistration (String name, String email, String sex, String birthdate, String citizenCardNumber, String phoneNumber, String tinNumber, String nhsNumber){

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

    //  Gets --------------------------------------------------------------------

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getSex() {
        return sex;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getCitizenCardNumber() {
        return citizenCardNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getTinNumber() { return tinNumber; }

    public String getNhsNumber() { return nhsNumber; }

    //  Sets -------------------------------------------------------------------

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setCitizenCardNumber(String citizenCardNumber) { this.citizenCardNumber = citizenCardNumber; }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setTinNumber(String tinNumber) { this.tinNumber = tinNumber; }

    public void setNhsNumber(String nhsNumber) { this.nhsNumber = nhsNumber; }

    //  Checks ---------------------------------------------------------------------

    private void checkNameRules(String name){

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

    private void checkEmailRules(String email){

        if (StringUtils.isBlank(email)) {
            throw new IllegalArgumentException("Email cannot be empty.");
        }

        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);

        if (!pat.matcher(email).matches()){
            throw new IllegalArgumentException("Invalid Email format.");
        }

    }

    private void checkSexRules(String sex){

        if (StringUtils.isBlank(sex)) {
            throw new IllegalArgumentException("Sex cannot be empty.");
        }

       if (!(sex.equalsIgnoreCase("Male") || sex.equalsIgnoreCase("Female") || sex.equalsIgnoreCase("Other"))){
           throw new IllegalArgumentException("Invalid sex");
       }

    }

    private void checkBirthdateRules(String birthdate){

    }

    private void checkCitizenCardNumberRules(String citizenCardNumber){

        String auxStrCitizenCardNumber = citizenCardNumber.replaceAll("\\s", "");
        char[] auxchar = auxStrCitizenCardNumber.toCharArray();

        if (StringUtils.isBlank(auxStrCitizenCardNumber)) {
            throw new IllegalArgumentException("Citizen card number cannot be empty.");
        }
        if (!(auxStrCitizenCardNumber.length() == 16)) {
            throw new IllegalArgumentException("Citizen card number must have 16 digit numbers.");
        }

        for (int i = 0; i < auxchar.length; i++) {
            char ch = auxchar[i];
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                throw new IllegalArgumentException("Invalid Citizen Card Number.");
            }
        }

    }

    private void checkPhoneNumberRules(String phoneNumber){

        String auxStrPhoneNumber = phoneNumber.replaceAll("\\s", "");
        char[] auxchar = auxStrPhoneNumber.toCharArray();

        if (StringUtils.isBlank(auxStrPhoneNumber)) {
            throw new IllegalArgumentException("Phone number cannot be empty.");
        }
        if (!(auxStrPhoneNumber.length() == 11)) {
            throw new IllegalArgumentException("Phone number must have 11 digit numbers.");
        }

        for (int i = 0; i < auxchar.length; i++) {
            char ch = auxchar[i];
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                throw new IllegalArgumentException("Invalid Phone Number.");
            }
        }

    }

    private void checkTINNumberRules(String tinNumber) {

        String auxStrTINnumber = tinNumber.replaceAll("\\s", "");
        char[] auxchar = auxStrTINnumber.toCharArray();

        if (StringUtils.isBlank(auxStrTINnumber)) {
            throw new IllegalArgumentException("TIN number cannot be empty.");
        }
        if (!(auxStrTINnumber.length() == 10)) {
            throw new IllegalArgumentException("TIN number must have 10 digit numbers.");
        }

        for (int i = 0; i < auxchar.length; i++) {
            char ch = auxchar[i];
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                throw new IllegalArgumentException("Invalid TIN Number.");
            }
        }

    }

    private void checkNHSNumberRules(String nhsNumber) {

        String auxStrNHSnumber = nhsNumber.replaceAll("\\s", "");
        char[] auxchar = auxStrNHSnumber.toCharArray();

        if (StringUtils.isBlank(auxStrNHSnumber)) {
            throw new IllegalArgumentException("TIN number cannot be empty.");
        }
        if (!(auxStrNHSnumber.length() == 10)) {
            throw new IllegalArgumentException("TIN number must have 10 digit numbers.");
        }

        for (int i = 0; i < auxchar.length; i++) {
            char ch = auxchar[i];
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                throw new IllegalArgumentException("Invalid NHS Number.");
            }
        }

    }

    @Override
    public String toString() {
        return "Client: " + name + ", Email: " + email + ", Sex: " + sex + ", Birth date: " + birthdate +
                ", Citizen Card Number: " + citizenCardNumber + ", Phone Number: " + phoneNumber +
                    ", TIN Number: " + tinNumber + ", NHS Number: " + nhsNumber;
    }
}
