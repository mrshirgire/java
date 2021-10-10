
public class DeadlockDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//below code cread deadlock condition
		(new Thread() {
			public void run() {
				synchronized (Integer.class) {
					System.out.println("interger class in lock");
					
					 try { Thread.sleep(100);} catch (Exception e) {}  
					 
					synchronized (String.class) {
						System.out.println("String class in lock");
					}
				}
				
			}
		}).start();
		
		(new Thread() {
			public void run() {
				synchronized (String.class) {
					System.out.println("String class in lock");
					
					 try { Thread.sleep(100);} catch (Exception e) {}  
					synchronized (Integer.class) {
						System.out.println("interger class in lock");
					}
				}
				
			}
		}).start();
		
		
		
		
		
		//below order solved deadlock 
		
	/*	(new Thread() {
			public void run() {
				synchronized (Integer.class) {
					System.out.println("interger class in lock");
					
					 try { Thread.sleep(100);} catch (Exception e) {}  
					 
					synchronized (String.class) {
						System.out.println("String class in lock");
					}
				}
				
			}
		}).start();
		
		(new Thread() {
			public void run() {
				synchronized (Integer.class) {
					System.out.println("String class in lock");
					
					 try { Thread.sleep(100);} catch (Exception e) {}  
					synchronized (String.class) {
						System.out.println("interger class in lock");
					}
				}
				
			}
		}).start();*/
	}

}
