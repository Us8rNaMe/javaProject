package practiceOOP.practise;
import java.util.ArrayList;
public class SportsGame extends EventCategory{
    String gameName,gameType,gameTeams;
    int gameDuration;

    public void updateGame(){
    }

    @Override
    public String getEventCategory() {
        return "SportsGame";
    }
}

