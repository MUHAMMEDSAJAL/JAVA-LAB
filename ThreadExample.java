class Odd extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i = i + 2) {
            System.out.println(i);
        }
    }
}

class Even extends Thread {
    public void run() {
        for (int i = 2; i <= 100; i = i + 2) {
            System.out.println(i);
        }
    }
}

class Main {
    public static void main(String args[]) {
        Odd odd = new Odd();
        Even even = new Even();
        odd.start();
        even.start();
    }
}