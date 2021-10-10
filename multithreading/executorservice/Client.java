package multithreading.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    
    public static void main(String[] args) {
        //ExecutorService  
        //Executor
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(()->System.out.println("Thread name: "+Thread.currentThread().getName()));
        executorService.execute(()->System.out.println("Thread name: "+Thread.currentThread().getName()));
        
        executorService.shutdown();
    }
}
