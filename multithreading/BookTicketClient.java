package multithreading;

public class BookTicketClient {
    
    public static void main(String[] args) {
        BookTicket bookTicket1 = new BookTicket();
        
        BookingThread1 bookingThread11 = new BookingThread1(bookTicket1, 40);
        BookingThread1 bookingThread12 = new BookingThread1(bookTicket1, 5);

        bookingThread11.start();
        bookingThread12.start();

        BookTicket bookTicket2 = new BookTicket();
        BookingThread2 bookingThread21 = new BookingThread2(bookTicket2, 3);
        BookingThread2 bookingThread22 = new BookingThread2(bookTicket2, 2);
        
        bookingThread21.start();
        bookingThread22.start();
    }
}
