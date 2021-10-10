class BankProcess {
	
	int amount =10000;
	
	public synchronized void wthdrow(int amount) throws InterruptedException {
		System.out.println("going to withdraw...");  
		if(amount>this.amount) {
			System.out.println("amount is less...");  
			wait();
		}
		
		this.amount-=amount;
		System.out.println("withdraw completed...");  
	}
	
	
	public synchronized void deposit(int amount) {
		System.out.println("going to deposit...");  
		this.amount+= amount;
		System.out.println("deposit completed... ");  
		notify();
	}
}


public class InnerThreadComm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankProcess b1 = new BankProcess();
		
		(new Thread() {
			public void run() {
				try {
					b1.wthdrow(15000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		
		(new Thread() {
			public void run() {
				b1.deposit(10000);
			}
		}).start();

	}

}
