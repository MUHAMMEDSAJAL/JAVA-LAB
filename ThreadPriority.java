class HelloThread extends Thread {
    public void run() {
        System.out.println("Executing in Hello Thread");
    }
}
class Main {
    public static void main(String args[]) {
        HelloThread ht1 = new HelloThread();
        HelloThread ht2 = new HelloThread();

        System.out.println("Priority of ht1 is " + ht1.getPriority());
        System.out.println("Priority of ht2 is " + ht2.getPriority());

        ht1.setPriority(6);
        ht2.setPriority(9);

        ht1.start();
        ht2.start();

        System.out.println("Priority of ht1 is " + ht1.getPriority());
        System.out.println("Priority of ht2 is " + ht2.getPriority());

    }
}