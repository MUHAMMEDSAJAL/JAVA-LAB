import java.util.Scanner;
class AgeCheck {
    void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age is less than 18");
        } else {
            System.out.println("You are old enough to vote.");
        }
    }
}
class Voting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        AgeCheck ageCheck = new AgeCheck();
        try {
            ageCheck.checkAge(age);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}