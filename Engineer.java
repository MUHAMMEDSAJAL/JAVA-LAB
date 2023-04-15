import java.io.*;
import java.util.Scanner;

class Employee {

    void display() {
        System.out.println("Name of Class is Employee");
    }

    void calcSalary() {
        System.out.println("Salary of employee is 10000");
    }
}

class Engineer extends Employee {
    void work() {
        super.display();
    }

    void calcSalary() {
        System.out.println("Salary of Engineer is 20000");
    }
}

class Main {
    public static void main(String args[]) {
        Engineer eng = new Engineer();
				eng.calcSalary();
				eng.work();
				eng.display();
    }
}