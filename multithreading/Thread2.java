package multithreading;

public class Thread2 implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread created using Runnable interface");
    }
}
