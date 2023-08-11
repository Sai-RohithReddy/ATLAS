package Office;

import java.util.ArrayList;

public abstract class Employee {
    ArrayList<EmployeeDetails> empList = new ArrayList<>();

    public void display() {
        for (EmployeeDetails e : empList) {
            String eName = e.employeeName;
            String mName = e.manager == null ? "N/A" : e.manager.employeeName;
            String role = e.role;
            int id = e.ID;

            System.out.printf("Employee Name: %s, Employee Manager: %s, Role: %s, Id: %d\n", eName, mName, role, id);
        }
    }

    abstract void addEmployee(String eName, String role, int eId);

    abstract void removeEmployee(String eName, int eId);

    abstract void addManager(int eId, int mId);

    abstract void removeManager(int eId);
}
