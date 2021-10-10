package multithreading.producer_consumer;

import java.util.LinkedList;

public class ProducerConsumer {

    LinkedList<Integer> list = new LinkedList<>();
    int capacity = 5;

    public void producer() throws InterruptedException{

        int value = 0;
        while(true){
            synchronized(this){
                while(this.list.size()== capacity){
                    wait();
                }

                System.out.println("produce value: "+value);

                list.add(value++);
                notify();

                Thread.sleep(1000);
            }
        }
    }


    public void consumer() throws InterruptedException {
        
        while(true){
            synchronized(this){
                while(this.list.size() == 0){
                    wait();
                }
                
                System.out.println("Consume value: "+list.removeFirst());

                notify();

                Thread.sleep(1000);
            }
        }
    }
}
