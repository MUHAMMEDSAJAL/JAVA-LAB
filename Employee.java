import java.util.Scanner;

class Employee {
    String name;
    int age;
    long phone;
    String address;
    double salary;

    void printSalary() {
        System.out.println("Salary is: " + salary);
    }
}
class Officer extends Employee {
    String specialization;
    void printSpecialization() {
        System.out.println("Specialization is: " + specialization);
    }
}
class Manager extends Employee {
    String department;
    void printDepartment() {
        System.out.println("Department is: " + department);
    }
}
class Home {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Officer officer = new Officer();
        System.out.println("===================OFFICER================");
        System.out.print("Enter the name of the Officer: ");
        officer.name = sc.next();
        System.out.print("Enter the age of the Officer: ");
        officer.age = sc.nextInt();
        System.out.print("Enter the phone number of the Officer: ");
        officer.phone = sc.nextLong();
        System.out.print("Enter the address of the Officer: ");
        officer.address = sc.next();
        System.out.print("Enter the salary of the Officer: ");
        officer.salary = sc.nextDouble();
        System.out.print("Enter the specialization of the Officer: ");
        officer.specialization = sc.next();

        Manager manager = new Manager();
        System.out.println("===================MANAGER================");
        System.out.print("Enter the name of the Manager: ");
        manager.name = sc.next();
        System.out.print("Enter the age of the Manager: ");
        manager.age = sc.nextInt();
        System.out.print("Enter the phone number of the Manager: ");
        manager.phone = sc.nextLong();
        System.out.print("Enter the address of the Manager: ");
        manager.address = sc.next();
        System.out.print("Enter the salary of the Manager: ");
        manager.salary = sc.nextDouble();
        System.out.print("Enter the department of the Manager: ");
        manager.department = sc.next();

        System.out.println("===================OFFICER================");
        System.out.println("Name: " + officer.name);
        System.out.println("Age: " + officer.age);
        System.out.println("Phone: " + officer.phone);
        System.out.println("Address: " + officer.address);
        System.out.println("Specialization: " + officer.specialization);
        officer.printSalary();

        System.out.print("===================MANAGER================");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone: " + manager.phone);
        System.out.println("Address: " + manager.address);
        System.out.println("Department: " + manager.department);
        manager.printSalary();
    }
}