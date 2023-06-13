package practiceOOP.practise;
import java.util.ArrayList;
public class Booking {
    String bookingId,userID,eventId;
    int numberOfTickets, seatNumbers;
    double totalPrice;
    static ArrayList<Booking>bookings = new ArrayList<>();
    public Booking(String bookingID,String userID,String eventID,int numberOfTickets,int seatNumbers,double totalPrice){
      this.bookingId =bookingID;
      this.userID = userID;
      this.eventId = eventID;
      this.numberOfTickets = numberOfTickets;
      this.seatNumbers = seatNumbers;
      this.totalPrice = totalPrice;
    }
    public void createBooking(){
        bookings.add(this);
    }
    public void updateBooking(){
    }
    public void cancelBooking(){
        bookings.remove(this);
    }
    public void viewBooking(String userID){
        for(Booking booking : bookings){
            if(booking.userID.equals(userID)){
                booking.printInfo();
            }
        }
    }

    public void printInfo() {
        System.out.println( "Booking info: " +
                "bookingId='" + bookingId + '\'' +
                ", userID='" + userID + '\'' +
                ", eventId='" + eventId + '\'' +
                ", numberOfTickets=" + numberOfTickets +
                ", seatNumbers=" + seatNumbers +
                ", totalPrice=" + totalPrice);
    }
}
