package app.domain.shared;

/**
 *
 * @author Paulo Maio <pam@isep.ipp.pt>
 */
public class Constants {

    public static final String ROLE_ADMIN = "ADMINISTRATOR";
    public static final String ROLE_RECEPTIONIST = "RECEPTIONIST";
    public static final String ROLE_MEDICAL_LAB_TECHNICIAN = "MEDICAL_LAB_TECHNICIAN";
    public static final String ROLE_CLINICAL_CHEMISTRY_TECHNOLOGIST ="CLINICAL_CHEMISTRY_TECHNOLOGIST";
    public static final String ROLE_CLIENT="CLIENT";

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

    public static final int LABORATORY_MAX = 5;
    public static final int NAME_CLINICAL_MAX = 20;
    public static final int ADDRESS_MAX = 30;
    public static final int PHONE_NUMBER_SIZE = 11;
    public static final int TIN_NUMBER_SIZE = 10;

    public static final int DOCTOR_INDEX_NUMBER_MAX=6;
    public final int NAME_EMPLOYEE_MAX=30;
    public static final int ADRESS_EMPLOYEE_MAX=30;
    public static final int PHONE_NUMBER_MAX=11;
    public static final int SOC_MAX=7;

    public static final int ACCESS_KEY = 12345;
    public static final String COVID_REFERENCE_API = "app.domain.model.RefValueAdapter1";
    public static final String EM_REFERENCE_API = "app.domain.model.RefValueAdapter2";

    public static final String BARCODE_IMAGE="BarcodeImage";
    public static final String PATH ="Barcodes\\";

    public static final String CLIENT_NOTIFICATION="Client_Notification";
    public static final String PATH_CLIENT="ClientNotification\\";

}