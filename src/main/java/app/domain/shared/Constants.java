package app.domain.shared;

/**
 *
 * @author Paulo Maio <pam@isep.ipp.pt>
 */
public class Constants {
    public static final String ROLE_ADMIN = "ADMINISTRATOR";
    public static final String ROLE_RECEPTIONIST = "RECEPTIONIST";
    public static final String ROLE_MEDICAL_LAB_TECHNICIAN = "MEDICAL_LAB_TECHNICIAN";


    public static final String PARAMS_FILENAME = "config.properties";
    public static final String PARAMS_COMPANY_DESIGNATION = "Company.Designation";

    public static final int TESTCODE_MAX = 5;
    public static final int COLLECTINGMETHOD_MAX = 20;
    public static final int DESCRIPTION_MAX = 15;

    public static final int CODE_CATEGORY_MAX = 5;
    public static final int CODE_MIN= 4;
    public static final int NHSLD_MAX = 10;
    public static final int DESCRIPTION_CATEGORY_MAX = 40;

    public static final int CODE_PARAMETER_MAX = 5;
    public static final int NAME_MAX = 8;
    public static final int DESCRIPTION_PARAMETER_MAX = 20;

    public static final int MIN_CLIENT_AGE = 0;
    public static final int MAX_CLIENT_AGE = 150;
}
