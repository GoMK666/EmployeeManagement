import java.util.Scanner;

public class MainEmployeeManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("     EMPLOYEE MANAGEMENT SYSTEM");
        System.out.println("========================================");

        // Read input from user
        System.out.print("Enter Employee ID   : ");
        String empID = scanner.nextLine();

        System.out.print("Enter Employee Name : ");
        String empName = scanner.nextLine();

        System.out.print("Enter Basic Salary  : ");
        double basicSalary = scanner.nextDouble();

        // Create Employee object using overloaded constructor
        Employee emp = new Employee(empID, empName, basicSalary);

        // Calculate allowance using the basic salary
        emp.calculateAllowance(basicSalary);

        // Calculate total salary
        double totalSalary = emp.calculateTotalSalary();

        // Display the output
        System.out.println("\n========================================");
        System.out.println("           EMPLOYEE DETAILS");
        System.out.println("========================================");
        System.out.println("Employee ID      : " + emp.getEmployeeID());
        System.out.println("Employee Name    : " + emp.getEmployeeName());
        System.out.printf ("Basic Salary     : %.2f%n", emp.getBasicSalary());
        System.out.printf ("Allowance (10%%)  : %.2f%n", emp.getAllowance());
        System.out.println("----------------------------------------");
        System.out.printf ("Total Salary     : %.2f%n", totalSalary);
        System.out.println("========================================");

        scanner.close();
    }
}
