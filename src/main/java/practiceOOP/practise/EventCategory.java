package practiceOOP.practise;

import java.util.ArrayList;

public abstract class EventCategory {
     private String eventCategory;

     public abstract String getEventCategory();

     static ArrayList<EventCategory>events = new ArrayList<>();

     public void createEvent(EventCategory event){
          events.add(event);
     }
     public void deleteEvent(EventCategory event){
          events.remove(event);
     }
     public void displayEventDetails(){
          System.out.println(toString());
     }

}
