package multithreading;

public class Thread1 extends Thread{

    @Override
    public void run() {

        System.out.println("Thread1 is start");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Thread1 is end");
    }
    
}
