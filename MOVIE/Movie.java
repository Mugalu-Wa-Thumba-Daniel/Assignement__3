
package MOVIE;

import java.util.ArrayList;

public class Movie {
    private ArrayList<String> MovieItem_2 = new ArrayList<>();

    public void addMovieItem(String movieItem) {
        this.MovieItem_2.add(movieItem);
    }
    public ArrayList<String> ReturnMovieItem() {
        return MovieItem_2;
    }

    public void printMovieDetails() {
        MoviesItems LetPrintDetails = new MoviesItems("Midnight Sun","Sarah Pears");
        LetPrintDetails.printDetails();
    }
}
