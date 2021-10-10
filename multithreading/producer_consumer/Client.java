package multithreading.producer_consumer;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        
        ProducerConsumer producerConsumer = new ProducerConsumer();

        /* Create producer thread */
        Thread producerThread = new Thread(()->{
            try{
                producerConsumer.producer();
            }catch(InterruptedException e){e.printStackTrace();}
        });

        /* Create consumer thread */
        Thread consumerThread = new Thread(()->{
            try{
                producerConsumer.consumer();
            }catch(InterruptedException e){e.printStackTrace();}
        });

        producerThread.start();
        consumerThread.start();

        producerThread.join();
        consumerThread.join();
    }
}
