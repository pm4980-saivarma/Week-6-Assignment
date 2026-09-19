class Employee {
    private String empName;
    private double salary;
    private static String companyName = "Bright Horizon Technologies";
    private static int employeeCount;

    public Employee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    public static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }
}

public class Main {
    public static void main(String[] args) {
        new Employee("Divya", 65000);
        new Employee("Arjun", 55000);
        new Employee("Priya", 60000);

        Employee.printCompanyInfo();
    }
}
