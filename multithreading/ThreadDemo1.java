
public class ThreadDemo1 extends Thread {

	public void run() {
		
		for(int i=0;i<2;i++) {
			System.out.println(Thread.currentThread().getName()+" is running...");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String args[]) throws InterruptedException {
		
		System.out.println("main tread is running...");
		ThreadDemo1 t1 = new ThreadDemo1();
		ThreadDemo1 t2 = new ThreadDemo1();
		t1.start();
		t1.join();
		t2.start();
	}
}
