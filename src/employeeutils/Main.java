package employeeutils;

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Rahul", "IT", 65000);
        Employee e2 = new Employee(102, "Priya", "HR", 58000);
        Employee e3 = new Employee(103, "Amit", "Finance", 72000);
        Employee e4 = new Employee(104, "Neha", "Marketing", 61000);
        Employee e5 = new Employee(105, "Karan", "Sales", 55000);
        Employee e6 = new Employee(101, "Rahul", "IT", 65000);

        Employee[] employees = {e1, e2, e3, e4, e5};

        System.out.println("=== Testing toString() ===");
        System.out.println(e1);
        System.out.println(e2);

        System.out.println("\n=== Testing equals() ===");
        System.out.println("e1.equals(e6): " + e1.equals(e6));
        System.out.println("e1.equals(e2): " + e1.equals(e2));

        System.out.println("\n=== Testing hashCode() ===");
        System.out.println("e1.hashCode(): " + e1.hashCode());
        System.out.println("e6.hashCode(): " + e6.hashCode());

        System.out.println("\n=== Utility Methods ===");

        double averageSalary =
                EmployeeUtils.calculateAverageSalary(employees);

        System.out.println("Average Salary: " + averageSalary);

        Employee highestPaid =
                EmployeeUtils.findHighestPaidEmployee(employees);

        System.out.println("Highest Paid Employee: " + highestPaid);
    }
}