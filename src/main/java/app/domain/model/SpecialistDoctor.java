package app.domain.model;

import app.domain.shared.Constants;
import org.apache.commons.lang3.StringUtils;

public class SpecialistDoctor extends EmployeeSuper {

   private String doctorIndexNumber;

    /**
     * Contructs an instance of Employee
     *
     * @param name the Employee's name
     * @param address the Employee's adress
     * @param email the Employee's email
     * @param phoneNumber the Employee's phone number
     * @param employeeId the Employee's employee ID
     * @param socCode the Employee's socCode
     * @param orgRole the Employee's organization role
     * @param doctorIndexNumber the Employee's doctor index number
     */

    public SpecialistDoctor(String name, String address, String email, String phoneNumber, String employeeId, String socCode, String orgRole, String doctorIndexNumber) {

       super(name,address,email,phoneNumber,employeeId,socCode,orgRole);

       checkDoctorIndexNumber(doctorIndexNumber);
       this.doctorIndexNumber=doctorIndexNumber;

    }

    //Checks

    /**
     * Checks the Employee's doctor index number (according to the acceptance criteira)
     *
     * @param doctorIndexNumber the Employee's doctor index number
     */

    public void checkDoctorIndexNumber(String doctorIndexNumber) {

        if (StringUtils.isBlank(doctorIndexNumber)) {
            throw new IllegalArgumentException("Doctor Index Number can't be empty.");
        }
        if (doctorIndexNumber.length() != Constants.DOCTOR_INDEX_NUMBER_MAX) {
            throw new IllegalArgumentException("Doctor Index Number needs to have exactly 6 digits.");
        }

    }

    public void setDoctorIndexNumber(String doctorIndexNumber) {
        this.doctorIndexNumber = doctorIndexNumber;
    }

    public String getDoctorIndexNumber() {
        return doctorIndexNumber;
    }

    @Override
    public String toString() {
        return
                super.toString()+
                "SpecialistDoctor{" +
                "doctorIndexNumber='" + doctorIndexNumber + '\'' +
                '}';
    }
}
