package practiceOOP.practise;
import java.util.ArrayList;
import java.util.List;
public class Event {
    String eventVenue,eventTime,eventDate,eventName,eventID,eventCategory;
    double ticketPrice;
    int totalSeats,availableSeats;
    static List<Event> eventsList = new ArrayList<>();
    public Event(String eventVenue,String eventCategory,String eventDate,String eventName, String eventTime,String eventID,double ticketPrice, int totalSeats,int availableSeats){
        this.eventID = eventID;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.eventName = eventName;
        this.eventCategory = eventCategory;
        this.availableSeats = availableSeats;
        this.eventVenue = eventVenue;
        this.ticketPrice = ticketPrice;
        this.totalSeats = totalSeats;
    }
    public void createEvent(){
        eventsList.add(this);
    }
    public void deleteEvent(){
        eventsList.remove(this);
    }
    public Event searchEvent(String eventName){
        for(Event event : eventsList){
            if(event.eventName.equals(eventName)){
                return event;
            }
        }
        System.out.println("Warning event does not exist in our system");
        return null;
    }
    public void displayEventDetails(){
        System.out.println("========================================"+"\n" +
                " Event name: "+eventName+"\n"+
                " date: "+eventDate+"\n"+
                " time: "+eventTime+"\n"+
                " venue: "+eventVenue+"\n"+
                " category: "+eventCategory+"\n"+
                " Ticket price: "+ticketPrice+"\n"+
                " Total seats: "+ totalSeats+"\n"+
                " Available seats: "+availableSeats+"\n"+
                "========================================");
    }
}
