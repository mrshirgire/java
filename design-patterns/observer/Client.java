package observer;

public class Client {
    
    public static void main(String[] args) {
        MessageSubscriberOne messageSubscriberOne = new MessageSubscriberOne();
        MessageSubscriberTwo messageSubscriberTwo = new MessageSubscriberTwo();
        MessageSubscriberThree messageSubscriberThree = new MessageSubscriberThree();
        
        MessagePublisher messagePublisher = new MessagePublisher();
        messagePublisher.subscribe(messageSubscriberOne);
        messagePublisher.subscribe(messageSubscriberTwo);

        messagePublisher.notifyUpdate(new Message("First Message"));

        System.out.println("--------------------------------------------------");

        messagePublisher.unsubscribe(messageSubscriberOne);
        messagePublisher.subscribe(messageSubscriberThree);

        messagePublisher.notifyUpdate(new Message("Second Message"));
    }
}
