package app.domain;

import org.apache.commons.lang3.StringUtils;

public class ClinicalAnalysisLaboratory {

    private String laboratoryID;
    private String name;
    private String address;
    private String phoneNumber;
    private String TINnumber;

    //private TestType testType;

    public ClinicalAnalysisLaboratory(String laboratoryID, String name, String address, String phoneNumber, String TINnumber) {
        this.laboratoryID = laboratoryID;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.TINnumber = TINnumber;

        checkLaboratoryIDRules(laboratoryID);
        checkNameRules(name);
        checkAddressRules(address);
        checkPhoneNumberRules(phoneNumber);
        checkTINnumberRules(TINnumber);
    }

    //  Gets --------------------------------------------------------------------

    public String getLaboratoryID() {
        return laboratoryID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getTINnumber() {
        return TINnumber;
    }

    //  Sets --------------------------------------------------------------------

    public void setLaboratoryID(String laboratoryID) {
        this.laboratoryID = laboratoryID;
    }

    public void setName(String name) {
        checkNameRules(name);
        this.name = name;
    }

    public void setAddress(String address) {
        checkAddressRules(address);
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        checkPhoneNumberRules(phoneNumber);
        this.phoneNumber = phoneNumber;
    }

    public void setTINnumber(String TINnumber) {
        checkTINnumberRules(TINnumber);
        this.TINnumber = TINnumber;
    }

    //  Checks --------------------------------------------------------------------

    private void checkLaboratoryIDRules(String laboratoryID) {
        if (StringUtils.isBlank(laboratoryID)) {
            throw new IllegalArgumentException("LaboratoryID cannot be blank.");
        }
        if (!(laboratoryID.matches("^[a-zA-Z0-9]*$") && laboratoryID.length() == 5)) {
            throw new IllegalArgumentException("LaboratoryID must be 5 alphanumeric characters.");
        }
    }

    private void checkNameRules(String name) {
        String aux = name.trim();
        aux = aux.toLowerCase();
        char[] auxchar = aux.toCharArray();

        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException("Name cannot be blank.");
        }
        if (!(name.length() < 30)) {
            throw new IllegalArgumentException("Name cannot have more than 30 characters.");
        }
        for (int i = 0; i < auxchar.length; i++) {
            char ch = auxchar[i];
            if (!(ch >= 'a' && ch <= 'z')) {
                throw new IllegalArgumentException("Invalid name! Try using only letters.");
            }
        }
    }

    private void checkAddressRules(String address) {
        if (StringUtils.isBlank(address)) {
            throw new IllegalArgumentException("Address cannot be blank.");
        }
        if (!(address.length() < 30)) {
            throw new IllegalArgumentException("Address cannot have more than 30 characters.");
        }
    }

    private void checkPhoneNumberRules(String phoneNumber) {
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

    private void checkTINnumberRules(String TINnumber) {
        String auxTrimTINnumber = TINnumber.replaceAll("\\p{Z}", "");
        char[] auxChar = auxTrimTINnumber.toCharArray();

        if (StringUtils.isBlank(TINnumber)) {
            throw new IllegalArgumentException("TIN number cannot be blank.");
        }
        if (!(TINnumber.length() == 10)) {
            throw new IllegalArgumentException("TIN number must be 10 digit numbers.");
        }
        for (int i = 0; i < auxChar.length; i++) {
            char ch = auxChar[i];
            if (ch >= 'a' && ch <= 'z') {
                throw new IllegalArgumentException("Invalid TIN number! Try using only numbers.");
            }
        }
    }

    @Override
    public String toString() {
        return "LaboratoryID: " + laboratoryID + ", Name: " + name + ", Address: " + address + ", Phone number: " + phoneNumber + ", TIN number: " + TINnumber;
    }
}

