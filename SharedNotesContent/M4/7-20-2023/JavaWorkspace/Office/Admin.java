package Office;


public class Admin extends Employee{

    @Override
    void addEmployee(String eName, String role, int eId) {
        EmployeeDetails a = new EmployeeDetails(eName, role, eId);
        empList.add(a);
    }

    @Override
    void removeEmployee(String empName, int eId) {
        boolean flag = false;
        for (int i = 0; i < empList.size(); i++) {
            if (empList.get(i).employeeName.equals(empName) && empList.get(i).ID == eId) {
                empList.remove(i);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Employee not found!!");
        }
    }

    @Override
    void addManager(int eId, int mId) {
        int eIndex = - 1, mIndex = -1;
        for (int i = 0; i < empList.size(); i++) {
            if (empList.get(i).ID == eId) {
                eIndex = i;
            }
            if (empList.get(i).ID == mId) {
                mIndex = i;
            }
        }
        if (eIndex >= 0 && mIndex >= 0) {
            empList.get(eIndex).manager = empList.get(mIndex);
        } else {
            System.out.println("Manager not assigned");
        }
    }

    @Override
    void removeManager(int eId) {
        int eIndex = - 1;
        for (int i = 0; i < empList.size(); i++) {
            if (empList.get(i).ID == eId) {
                eIndex = i;
                break;
            }
        }
        if (eIndex >= 0) {
            empList.get(eIndex).manager = null;
        } else {
            System.out.println("Manager not removed");
        }
    }
    
}
