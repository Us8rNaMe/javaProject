package practiceOOP.practise;

import java.util.ArrayList;

public class Movie extends EventCategory{
    String movieName,movieGenre;
    double movieRating;
    int movieDuration;

    public Movie(String movieName, String movieGenre, double movieRating, int movieDuration) {
        this.movieName = movieName;
        this.movieGenre = movieGenre;
        this.movieRating = movieRating;
        this.movieDuration = movieDuration;
    }
    public void updateMovie(){
    }
    @Override
    public String getEventCategory() {
        return "Movie";
    }
}
