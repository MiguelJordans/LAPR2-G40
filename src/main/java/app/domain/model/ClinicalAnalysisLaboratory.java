package app.domain.model;

import app.domain.shared.Constants;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class ClinicalAnalysisLaboratory {

    private String laboratoryID;
    private String name;
    private String address;
    private String phoneNumber;
    private String tinNumber;
    private List<TestType> ttList;

    /**
     * Constructs an instance of Clinical Analysis Laboratory.
     *
     * @param laboratoryID the Clinical Analysis Laboratory's laboratory ID
     * @param name         the Clinical Analysis Laboratory's name
     * @param address      the Clinical Analysis Laboratory's address
     * @param phoneNumber  the Clinical Analysis Laboratory's phone number
     * @param tinNumber    the Clinical Analysis Laboratory's TIN number
     */

    public ClinicalAnalysisLaboratory(String laboratoryID, String name, String address, String phoneNumber, String tinNumber, List<TestType> ttList) {

        checkLaboratoryIDRules(laboratoryID);
        checkNameRules(name);
        checkAddressRules(address);
        checkPhoneNumberRules(phoneNumber);
        checkTinNumberRules(tinNumber);
        checkTestTypeList(ttList);

        this.laboratoryID = laboratoryID;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.tinNumber = tinNumber;
        this.ttList = ttList;

    }

    //  Gets --------------------------------------------------------------------

    /**
     * Returns the laboratory ID of the Clinical Analysis Laboratory.
     *
     * @return the laboratory ID of the Clinical Analysis Laboratory
     */

    public String getLaboratoryID() {
        return laboratoryID;
    }

    /**
     * Returns the name of the Clinical Analysis Laboratory.
     *
     * @return the name of the Clinical Analysis Laboratory
     */

    public String getName() {
        return name;
    }

    /**
     * Returns the address of the Clinical Analysis Laboratory.
     *
     * @return the address of the Clinical Analysis Laboratory
     */

    public String getAddress() {
        return address;
    }

    /**
     * Returns the phone number of the Clinical Analysis Laboratory.
     *
     * @return the phone number of the Clinical Analysis Laboratory
     */

    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Returns the TIN number of the Clinical Analysis Laboratory.
     *
     * @return the TIN number of the Clinical Analysis Laboratory
     */

    public String getTINnumber() {
        return tinNumber;
    }

    /**
     * Gets the test type list.
     *
     * @return the test type list
     */
    public List<TestType> getTtList() {
        return ttList;
    }

    //  Sets --------------------------------------------------------------------

    /**
     * Modifies the laboratory ID of the Clinical Analysis Laboratory.
     *
     * @param laboratoryID the Clinical Analysis Laboratory's laboratory ID
     */

    public void setLaboratoryID(String laboratoryID) {
        this.laboratoryID = laboratoryID;
    }

    /**
     * Modifies the name of the Clinical Analysis Laboratory.
     *
     * @param name the Clinical Analysis Laboratory's name
     */

    public void setName(String name) {
        checkNameRules(name);
        this.name = name;
    }

    /**
     * Modifies the address of the Clinical Analysis Laboratory.
     *
     * @param address the Clinical Analysis Laboratory's address
     */

    public void setAddress(String address) {
        checkAddressRules(address);
        this.address = address;
    }

    /**
     * Modifies the phone number of the Clinical Analysis Laboratory.
     *
     * @param phoneNumber the Clinical Analysis Laboratory's phone number
     */

    public void setPhoneNumber(String phoneNumber) {
        checkPhoneNumberRules(phoneNumber);
        this.phoneNumber = phoneNumber;
    }

    /**
     * Modifies the TIN number of the Clinical Analysis Laboratory.
     *
     * @param tinNumber the Clinical Analysis Laboratory's TIN number
     */

    public void setTinNumber(String tinNumber) {
        checkTinNumberRules(tinNumber);
        this.tinNumber = tinNumber;
    }

    /**
     * Modifies the test type list.
     *
     * @param ttList the test type list
     */
    public void setTtList(List<TestType> ttList) {
        this.ttList = ttList;
    }

    //  Checks --------------------------------------------------------------------

    /**
     * Checks the laboratory ID rules.
     *
     * @param laboratoryID the Clinical Analysis Laboratory's laboratory ID
     */

    private void checkLaboratoryIDRules(String laboratoryID) {
        if (StringUtils.isBlank(laboratoryID)) {
            throw new IllegalArgumentException("LaboratoryID cannot be blank.");
        }
        if (!(laboratoryID.matches("^[a-zA-Z0-9]*$") && laboratoryID.length() == Constants.LABORATORY_MAX)) {
            throw new IllegalArgumentException("LaboratoryID must be 5 alphanumeric characters.");
        }
    }

    /**
     * Checks the name rules.
     *
     * @param name the Clinical Analysis Laboratory's name
     */

    private void checkNameRules(String name) {
        String aux = name.trim();
        aux = aux.toLowerCase();
        char[] auxchar = aux.toCharArray();

        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException("Name cannot be blank.");
        }
        if (name.length() >= Constants.NAME_CLINICAL_MAX) {
            throw new IllegalArgumentException("Name cannot have more than 20 characters.");
        }
        for (int i = 0; i < auxchar.length; i++) {
            char ch = auxchar[i];
            if (!(ch >= 'a' && ch <= 'z')) {
                throw new IllegalArgumentException("Invalid name! Try using only letters.");
            }
        }
    }

    /**
     * Checks the address rules.
     *
     * @param address the Clinical Analysis Laboratory's address
     */

    private void checkAddressRules(String address) {
        if (StringUtils.isBlank(address)) {
            throw new IllegalArgumentException("Address cannot be blank.");
        }
        if (address.length() >= Constants.ADDRESS_MAX) {
            throw new IllegalArgumentException("Address cannot have more than 30 characters.");
        }
    }

    /**
     * Checks the phone number rules.
     *
     * @param phoneNumber the Clinical Analysis Laboratory's phone number
     */

    private void checkPhoneNumberRules(String phoneNumber) {
        String auxTrimPhoneNumber = phoneNumber.replaceAll("\\s", "");
        char[] auxChar = auxTrimPhoneNumber.toCharArray();

        if (StringUtils.isBlank(phoneNumber)) {
            throw new IllegalArgumentException("Phone number cannot be blank.");
        }
        if (phoneNumber.length() != Constants.PHONE_NUMBER_SIZE) {
            throw new IllegalArgumentException("Phone number must be 11 digit numbers.");
        }
        for (int i = 0; i < auxChar.length; i++) {
            char ch = auxChar[i];
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                throw new IllegalArgumentException("Invalid phone number! Try using only numbers.");
            }
        }
    }

    /**
     * Checks the TIN number rules.
     *
     * @param tinNumber the Clinical Analysis Laboratory's TIN number
     */

    private void checkTinNumberRules(String tinNumber) {
        String auxTrimTinNnumber = tinNumber.replaceAll("\\s", "");
        char[] auxChar = auxTrimTinNnumber.toCharArray();

        if (StringUtils.isBlank(tinNumber)) {
            throw new IllegalArgumentException("TIN number cannot be blank.");
        }
        if (tinNumber.length() != Constants.TIN_NUMBER_SIZE) {
            throw new IllegalArgumentException("TIN number must be 10 digit numbers.");
        }
        for (int i = 0; i < auxChar.length; i++) {
            char ch = auxChar[i];
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                throw new IllegalArgumentException("Invalid TIN number! Try using only numbers.");
            }
        }
    }

    /**
     * Checks the Test Type list.
     *
     * @param ttList the Test Type list
     */
    public void checkTestTypeList(List<TestType> ttList) {
        if (ttList.isEmpty()) {
            throw new IllegalArgumentException("Test type list is not valid! List is null!");
        }
    }

    /**
     * Returns the textual description of the Clinical Analysis Laboratory in the format: laboratory ID, name,
     * address, phone number, TIN number.
     *
     * @return the Clinical Analysis Laboratory's characteristics
     */
    @Override
    public String toString() {
        return "LaboratoryID: " + laboratoryID + ", Name: " + name + ", Address: " + address + ", Phone number: " + phoneNumber + ", TIN number: " + tinNumber;
    }
}

