package employeeStats;

public class EmployeeTest {
    public static void main(String[] args) {
        // Create two Employee objects
        Employee employee1 = new Employee("John", "Doe", 5000.0);
        Employee employee2 = new Employee("Jane", "Smith", 6000.0);

        // Display the yearly salary for each employee
        System.out.println("Yearly Salary for Employee 1: " + employee1.calculateYearlySalary());
        System.out.println("Yearly Salary for Employee 2: " + employee2.calculateYearlySalary());

        // Give each employee a 10% raise
        employee1.giveRaise();
        employee2.giveRaise();

        // Display the yearly salary after the raise
        System.out.println("Yearly Salary for Employee 1 (After Raise): " + employee1.calculateYearlySalary());
        System.out.println("Yearly Salary for Employee 2 (After Raise): " + employee2.calculateYearlySalary());
    }
}