class Car {
	
	/* synchronized */ public void driving() throws InterruptedException {
		System.out.println(" outside synchonozed..");
		 synchronized(this) {
			 for(int i=0;i<2;i++) {
					System.out.println(Thread.currentThread().getName()+" driving the car no "+i);
					Thread.sleep(500);
				} 
		 }
	}
}


public class SynchronizationDemo1 {
	
	public static void main(String args[]) {

		Car c1 = new Car();
		(new Thread() {
			public void run() {
				try {
					c1.driving();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		
		(new Thread() {
			public void run() {
				try {
					c1.driving();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
	}
}
