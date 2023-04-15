interface PersonalDetails {
    void printName();
}
interface CollegeDetails {
    void printCollegeName();
}
interface Student extends PersonalDetails, CollegeDetails {
    void printClass();
}

class Home implements Student {
    public void printName() {
        System.out.println("Diya Syam");
    }
    public void printCollegeName() {
        System.out.println("Ilahia College of Engineering & Technology");
    }
    public void printClass() {
        System.out.println("S3 RA");
    }
}

class Main {
    public static void main(String args[]) {
        Home home = new Home();
        home.printName();
        home.printClass();
        home.printCollegeName();
    }
}