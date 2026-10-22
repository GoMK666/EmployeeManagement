public class Employee {
    // Member variables
    private String employeeID;
    private String employeeName;
    private double basicSalary;
    
    // Fixed allowance rate - using 'final' keyword to fix the value at 10%
    private static final double ALLOWANCE_RATE = 0.10;
    
    // Additional variable to store computed allowance
    private double allowance;

    // b) Default constructor with no parameters
    public Employee() {
        this.employeeID = "";
        this.employeeName = "";
        this.basicSalary = 0.0;
        this.allowance = 0.0;
    }

    // c) Overloaded constructor - initializes all variables EXCEPT Allowance Rate
    public Employee(String employeeID, String employeeName, double basicSalary) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.allowance = 0.0;
    }

    // d) Method to calculate allowance based on given basic salary
    public void calculateAllowance(double basicSalary) {
        this.allowance = ALLOWANCE_RATE * basicSalary;
    }

    // e) Method to compute Total Salary (Basic Salary + Allowance)
    public double calculateTotalSalary() {
        return this.basicSalary + this.allowance;
    }

    // Getter methods
    public String getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getAllowance() {
        return allowance;
    }

    // Setter methods (optional but useful)
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
}
