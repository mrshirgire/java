package multithreading;

public class BookTicket {
    
    static private int availableSeats = 50;

    /* synchronized method*/
    
    // synchronized public void book(int seats){

    //     if(availableSeats >=seats){
    //         System.out.println(seats+" booked succussfully.");
    //         availableSeats = availableSeats - seats;
            
    //     }else{
    //         System.out.println("seats can not booked");
    //         System.out.println("available seats: "+availableSeats);
    //     }
    // }

    /* sychronized block*/
    // public void book(int seats){
        
    //     synchronized(this){
    //         if(availableSeats >=seats){
    //             System.out.println(seats+" booked succussfully.");
    //             availableSeats = availableSeats - seats;
                
    //         }else{
    //             System.out.println("seats can not booked");
    //             System.out.println("available seats: "+availableSeats);
    //         }
    //     }
        
    // }

    static synchronized public void book(int seats){

        if(availableSeats >=seats){
            System.out.println(seats+" booked succussfully.");
            availableSeats = availableSeats - seats;
            
        }else{
            System.out.println("seats can not booked");
            System.out.println("available seats: "+availableSeats);
        }
    }
    
}
