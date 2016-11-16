package Classes;

/**
 * Created by JPMPC-B218 on 11/10/2016.
 */
public class Employee extends Person{

    public String department;
    public float sssID;
    public float pagibigID;
    public float employeeID;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public float getSssID() {
        return sssID;
    }

    public void setSssID(float sssID) {
        this.sssID = sssID;
    }

    public float getPagibigID() {
        return pagibigID;
    }

    public void setPagibigID(float pagibigID) {
        this.pagibigID = pagibigID;
    }

    public float getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(float employeeID) {
        this.employeeID = employeeID;
    }
}
