import java.util.*;

class Employee {
    private String name;
    private int employeeID;
    private double salary;

    // Default Constructor
    public Employee() {
        this.name = "Unknown";
        this.employeeID = 0;
        this.salary = 0.0;
    }

    // Constructor with name only
    public Employee(String name) {
        this.name = name;
        this.employeeID = 0;
        this.salary = 0.0;
    }

    // Constructor with name and employeeID
    public Employee(String name, int employeeID) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = 0.0;
    }

    // Constructor with all fields
    public Employee(String name, int employeeID, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Getters
    public String getName() { return name; }
    public int getEmployeeID() { return employeeID; }
    public double getSalary() { return salary; }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + employeeID + ", Salary: ₹" + salary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ravi", 101, 72000));
        employees.add(new Employee("Priya", 102, 80000));
        employees.add(new Employee("Arjun", 103, 85000));
        employees.add(new Employee("Neha", 104, 95000));
        employees.add(new Employee("Kiran", 105, 78000));

        System.out.println("All Employee Details:");
        displayAll(employees);

        double avg = averageSalary(employees);
        System.out.println("\nAverage Salary: ₹" + avg);

        Employee top = highestPaid(employees);
        System.out.println("\nHighest Paid Employee:");
        if (top != null) top.displayDetails();
    }

    public static void displayAll(List<Employee> list) {
        for (Employee e : list) e.displayDetails();
    }

    public static double averageSalary(List<Employee> list) {
        double total = 0;
        for (Employee e : list) total += e.getSalary();
        return list.isEmpty() ? 0 : total / list.size();
    }

    public static Employee highestPaid(List<Employee> list) {
        if (list.isEmpty()) return null;
        Employee max = list.get(0);
        for (Employee e : list) {
            if (e.getSalary() > max.getSalary()) max = e;
        }
        return max;
    }
}