package multithreading;

class Medical extends Thread{

    @Override
    public void run(){

        System.out.println("Medical start");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Medical end");
    }
}

class TestDrive extends Thread{

    @Override
    public void run(){

        System.out.println("Test drive start");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
        System.out.println("Test drive end");
    }
}

class OfficeSign extends Thread {

    @Override
    public void run(){

        System.out.println("Office work start");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Office work end");
    }
}


public class JoinDemo {
    
    public static void main(String[] args) throws InterruptedException {
        
        Medical medical = new Medical();
        TestDrive testDrive = new TestDrive();
        OfficeSign officeSign = new OfficeSign();

        medical.start();
        medical.join();

        testDrive.start();
        testDrive.join();

        officeSign.start();

    }    
}
