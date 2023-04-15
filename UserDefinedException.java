class InvalidAgeException extends Exception {
    InvalidAgeException(String str) {
        super(str);
    }
}

class AgeCheck {
    void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Not 18");
        } else {
            System.out.println("Eligible to Vote");
        }
    }
}
class Main {
    public static void main(String args[]) {
        AgeCheck ageCheck = new AgeCheck();
        try {
            ageCheck.checkAge(13);
        } catch (InvalidAgeException ex) {
            System.out.println(ex);
        }
    }

}