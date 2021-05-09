package app.domain;

import java.util.ArrayList;
import java.util.List;


public class EmployeeStore {

    List <Employee> employeeList;
    Employee emp;

    public EmployeeStore(){this.employeeList = new ArrayList<Employee>();}

    public Employee NewEmployee (String name, String address, String email, String phoneNumber, String employeeId, String socCode, String orgRole, String doctorIndexNumber){
        return this.emp = new Employee(name, address, email, phoneNumber, employeeId, socCode, orgRole, doctorIndexNumber);
    }

    public boolean validateEmployee (Employee emp){

        if (emp == null || listContain(emp)){
            return false;
        }
        return true;

    }

    public boolean listContain(Employee emp){
        if(this.employeeList.contains(emp)){
            return true;
        } else {
            return false;
        }
    }

    public boolean saveEmployee(){
        if(validateEmployee(this.emp)){
            listAdd(emp);
            return true;
        } else {
            return false;
        }

    }

    public boolean listAdd(Employee emp){
        employeeList.add(emp);
        return true;
    }

    public Employee getEmployee (int i){
        return employeeList.get(i);
    }

    public Employee getEmp (){
        return emp;
    }


}
