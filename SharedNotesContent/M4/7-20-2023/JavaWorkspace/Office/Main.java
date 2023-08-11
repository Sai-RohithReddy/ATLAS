package Office;

public class Main {
    public static void main(String[] args) {
        Employee e = new Admin();

        e.addEmployee("Rohith", "SDE", 123);
        e.addEmployee("Bharath", "QA", 111);
        e.addEmployee("SAM", "Manager", 555);
        e.addEmployee("AB", "Sr.Manager", 333);
        e.addEmployee("Jeff", "CEO", 999);
        e.addEmployee("David", "Ops", 888);

        e.addManager(123, 555);
        e.addManager(111, 555);
        e.addManager(555, 333);
        e.addManager(999, 999);

        e.display();

        System.out.println("_______________________________________");

        e.removeManager(111);
        e.addManager(123, 333);
        e.removeEmployee("David", 888);
        
        e.display();

    }
}
