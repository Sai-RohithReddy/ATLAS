package Office;

class EmployeeDetails {
    String employeeName;
    EmployeeDetails manager;
    String role;
    int ID;

    public EmployeeDetails(String employeeName, String role, int ID) {
        this.employeeName = employeeName;
        this.role = role;
        this.ID = ID;
    }
}
