import java.lang.Thread;
import java.lang.InterruptedException;

class Table {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
class Thread1 extends Thread {
    Table table;
    Thread1(Table table) {
        this.table = table;
    }
    public void run() {
        table.printTable(5);
    }
}
class Thread2 extends Thread {
    Table table;
    Thread2(Table table) {
        this.table = table;
    }
    public void run() {
        table.printTable(10);
    }
}
class ThreadSync {
    public static void main(String[] args) {
        Table t = new Table();
        Thread1 t1 = new Thread1(t);
        Thread2 t2 = new Thread2(t);
        t1.start();
        t2.start();
    }
}