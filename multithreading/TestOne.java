package multithreading;

public class TestOne {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        thread1.start();

        Thread2 thread2 = new Thread2();
        Thread t = new Thread(thread2);
        t.start();
    }
}
