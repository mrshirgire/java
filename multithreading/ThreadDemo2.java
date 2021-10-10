import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread extends Thread {
	
	  private String message;  
	    public MyThread(String s){  
	        this.message=s;  
	    }  
	 public void run() {  
	        System.out.println(Thread.currentThread().getName()+" (Start) message = "+message);  
	        processmessage();//call processmessage method that sleeps the thread for 2 seconds  
	        System.out.println(Thread.currentThread().getName()+" (End)");//prints thread name  
	}  
	 
	    private void processmessage() {  
	        try {  Thread.sleep(2000);  } catch (InterruptedException e) { e.printStackTrace(); }  
	    }  
}


public class ThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		 for (int i = 0; i < 10; i++) {  
				executor.execute(new MyThread(" "+i));
		 }
	
	
		
	}

}
