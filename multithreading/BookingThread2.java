package multithreading;

public class BookingThread2 extends Thread{
    private BookTicket bookTicket;
    private int seats;

    BookingThread2(BookTicket bookTicket, int seats){
        this.bookTicket = bookTicket;
        this.seats = seats;
    }

    public void run(){
        BookTicket.book(seats);
    }
}
