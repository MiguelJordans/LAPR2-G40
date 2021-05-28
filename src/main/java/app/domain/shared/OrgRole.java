package app.domain.shared;

import app.domain.shared.Constants;

import java.util.ArrayList;
import java.util.List;

public class OrgRole {

    List<String> orgRoles;

    public OrgRole(){

        orgRoles = new ArrayList<>();
        orgRoles.add(Constants.ROLE_MEDICAL_LAB_TECHNICIAN);
        orgRoles.add(Constants.ROLE_RECEPTIONIST);
        orgRoles.add(Constants.ROLE_CLINICAL_CHEMISTRY_TECHNOLOGIST);
        orgRoles.add(Constants.ROLE_SPECIALIST_DOCTOR);
        orgRoles.add(Constants.ROLE_LABORATORY_COORDINATOR);
    }

    public List<String> orgRoles(){

       return orgRoles;

    }

}
