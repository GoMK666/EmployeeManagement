# Employee Management System (Java)

A simple Java console application that demonstrates core **Object-Oriented Programming (OOP)** concepts by managing employee records and calculating salaries with a fixed allowance rate.

---

## 📋 Features

- Store employee details (ID, Name, Basic Salary)
- Fixed **10% allowance rate** using the `final` keyword
- Calculate allowance based on basic salary
- Compute **total salary** (Basic Salary + Allowance)
- Clean console-based output
- Demonstrates both **default** and **overloaded** constructors

---

## 🛠️ Concepts Covered

| Concept | Where It's Used |
|---------|-----------------|
| Classes & Objects | `Employee` and `MainEmployeeManagement` |
| Constructors (default & overloaded) | `Employee()` and `Employee(String, String, double)` |
| `static final` keyword | `ALLOWANCE_RATE` constant |
| Encapsulation | `private` fields with getters/setters |
| Methods with/without parameters | `calculateAllowance(double)`, `calculateTotalSalary()` |
| `Scanner` for user input | In `MainEmployeeManagement` |

---

## 📁 Project Structure
employee-management-system/
│
├── Employee.java # Employee class with attributes & methods
├── MainEmployeeManagement.java # Controlling class (main method)
└── README.md # Project documentation


---

## ⚙️ Requirements

- **Java JDK 8 or higher** installed
- Any IDE (IntelliJ IDEA, Eclipse, VS Code) **or** just the command line

Check your Java installation:

```bash
java -version
javac -version
