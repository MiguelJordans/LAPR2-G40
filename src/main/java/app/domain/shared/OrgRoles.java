package app.domain.shared;

import java.util.ArrayList;
import java.util.List;

public class OrgRoles {

    List<String> orgRoleList;

    public OrgRoles() {

        orgRoleList = new ArrayList<>();
        orgRoleList.add(Constants.ROLE_MEDICAL_LAB_TECHNICIAN);
        orgRoleList.add(Constants.ROLE_RECEPTIONIST);
        orgRoleList.add(Constants.ROLE_CLINICAL_CHEMISTRY_TECHNOLOGIST);
        orgRoleList.add(Constants.ROLE_SPECIALIST_DOCTOR);
        orgRoleList.add(Constants.ROLE_LABORATORY_COORDINATOR);
    }

    public List<String> orgRoles() {
        return orgRoleList;
    }
}
