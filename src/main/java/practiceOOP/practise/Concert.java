package practiceOOP.practise;

import java.util.ArrayList;

public class Concert extends EventCategory {
    String concertName, concertGenre, concertArtist;
    int concertDuration;
    static ArrayList<Concert> concerts=new ArrayList<>();
    public Concert(String concertName, String concertGenre, String concertArtist, int concertDuration) {
        this.concertName = concertName;
        this.concertGenre = concertGenre;
        this.concertDuration = concertDuration;
        this.concertArtist = concertArtist;
    }
    public void updateConcert(String update,String newValue){
    }

    @Override
    public String getEventCategory() {
        return "Concert";
    }
}
