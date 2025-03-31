package OOPs;

abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();

    void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }
}

class Developer extends Employee {
    double basicSalary, bonus;

    Developer(String name, int id, double basicSalary, double bonus) {
        super(name, id);
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return basicSalary + bonus;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Developer");
        System.out.println("Total Salary: " + calculateSalary());
    }
}

class Manager extends Employee {
    double basicSalary, hra, allowance;

    Manager(String name, int id, double basicSalary, double hra, double allowance) {
        super(name, id);
        this.basicSalary = basicSalary;
        this.hra = hra;
        this.allowance = allowance;
    }

    @Override
    double calculateSalary() {
        return basicSalary + hra + allowance;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Manager");
        System.out.println("Total Salary: " + calculateSalary());
    }
}

class Intern extends Employee {
    double stipend;

    Intern(String name, int id, double stipend) {
        super(name, id);
        this.stipend = stipend;
    }

    @Override
    double calculateSalary() {
        return stipend;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Intern");
        System.out.println("Total Stipend: " + calculateSalary());
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Employee emp1 = new Developer("John", 101, 50000, 10000);
        Employee emp2 = new Manager("Alice", 102, 80000, 20000, 15000);
        Employee emp3 = new Intern("Bob", 103, 15000);

        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
    }
}
