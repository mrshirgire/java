
public class AnnonymousDemo1 {
	
	public static void main(String args[]) {
		
		(new Thread() {
			public void run() {
				System.out.println("task one"); 
			}
		}).start();
		
		(new Thread() {
			public void run() {
				System.out.println("task two"); 
			}
		}).start();
		
		(new Thread(new Runnable() {
			public void run() {
				System.out.println("task three"); 
			}
		})).start();
	}

}
