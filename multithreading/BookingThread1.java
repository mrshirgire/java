package multithreading;

public class BookingThread1 extends Thread{
    
    private BookTicket bookTicket;
    private int seats;

    BookingThread1(BookTicket bookTicket, int seats){
        this.bookTicket = bookTicket;
        this.seats = seats;
    }

    public void run(){
        BookTicket.book(seats);
    }
}
