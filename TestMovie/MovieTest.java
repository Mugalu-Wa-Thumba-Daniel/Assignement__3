/**
 public class MovieTest extends MovieItem {
    protected MovieTest(String Title, String Author){
        super(Title, Author);
     }
 MovieItem test = new MovieItem();
 }
 //public class MovieTest extends MoviesItems {
 //MovieTest test = new MovieTest();
 //test.MoviesItems("This is The Title", "This is The Author");
 */

package TestMovie;

import MOVIE.*;

import java.util.ArrayList;

public class MovieTest {
    public static void main(String[] args) {
        Movie Movie_Object = new Movie();
        for (int i = 1; i < 6; i++) {
            Movie_Object.addMovieItem("\n Title : Mission Impossible " + i + " || Author : McQuarrie \n");
        }
        ArrayList<String> GetReturnMovieItem = Movie_Object.ReturnMovieItem();
        System.out.println("\n");
        System.out.println("These are MovieItem objects that should have different titles and authors. \n");
        System.out.println(GetReturnMovieItem);
        System.out.println("\n");

        System.out.println("This is the Item you creted in the class Movie which linked to the Movies Items Class \n");
        Movie_Object.printMovieDetails();
    }
}
