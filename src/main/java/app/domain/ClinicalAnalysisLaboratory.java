package app.domain;

import org.apache.commons.lang3.StringUtils;

public class ClinicalAnalysisLaboratory {

    private String laboratoryID;
    private String name;
    private String address;
    private long phoneNumber;
    private long TINnumber;

    //private TestType testType;

    public ClinicalAnalysisLaboratory(String laboratoryID, String name, String address, long phoneNumber, long TINnumber) {
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

    public String getLaboratoryID() {
        return laboratoryID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public long getTINnumber() {
        return TINnumber;
    }

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

    public void setPhoneNumber(long phoneNumber) {
        checkPhoneNumberRules(phoneNumber);
        this.phoneNumber = phoneNumber;
    }

    public void setTINnumber(long TINnumber) {
        checkTINnumberRules(TINnumber);
        this.TINnumber = TINnumber;
    }

    private void checkLaboratoryIDRules(String laboratoryID) {
        if (StringUtils.isBlank(laboratoryID)) {
            throw new IllegalArgumentException("LaboratoryID cannot be blank.");
        }
        if (!(laboratoryID.matches("^[a-zA-Z0-9]*$") || laboratoryID.length() == 5)) {
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

    private void checkPhoneNumberRules(long phoneNumber) {
        String strPhoneNumber = String.valueOf(phoneNumber);
        String auxStrPhoneNumber = strPhoneNumber.trim();

        if (StringUtils.isBlank(auxStrPhoneNumber)) {
            throw new IllegalArgumentException("Phone number cannot be blank.");
        }
        if (!(auxStrPhoneNumber.length() == 11)) {
            throw new IllegalArgumentException("Phone number must be 11 digit numbers.");
        }
    }

    private void checkTINnumberRules(long TINnumber) {
        String strTINnumber = String.valueOf(TINnumber);
        String auxStrTINnumber = strTINnumber.trim();

        if (StringUtils.isBlank(auxStrTINnumber)) {
            throw new IllegalArgumentException("TIN number cannot be blank.");
        }
        if (!(auxStrTINnumber.length() == 10)) {
            throw new IllegalArgumentException("TIN number must be 10 digit numbers.");
        }
    }

    @Override
    public String toString() {
        return "ClinicalAnalysisLaboratory{" +
                "laboratoryID='" + laboratoryID + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", TINnumber='" + TINnumber + '\'' +
                '}';
    }
}
