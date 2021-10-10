package observer;

public interface Subject {
    public void subscribe(Observer o);
    public void unsubscribe(Observer o);
    public void notifyUpdate(Message m);
}
