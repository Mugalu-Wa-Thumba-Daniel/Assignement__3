/*
    Shift + F10 (Run the Cod)
    Alt + Enter (at the highlighted to see how IntelliJ Idea Suggests fixing it.)
    Shift + F9 (for debugging.)
    Control + F8 (for debugging.)
*/
import java.lang.String;

public class Book {
    public String Title;
    public String Author;
    public String ISBN;
    int copiesAvailable;
    // Constructor to initialize all attributes.
    public Book(String Title, String Author, String ISBN, int copiesAvailable) {
        this.Title = Title;
        this.Author = Author;
        this.ISBN = ISBN;
        this.copiesAvailable = copiesAvailable;
    }
    // Getter for ISBN.
    public String getISBN() {
        return ISBN;
    }
    public String getAuthor() {
        return Author;
    }
    // Setter for copiesAvailable.
    public void setCopiesAvailable(int copiesAvailable) {
        this.copiesAvailable = copiesAvailable;
    }
    // Getter for copiesAvailable.
    int getCopiesAvailable(int copies) {
        System.out.println("The number of copies is : " + copiesAvailable);
        return copies;
    }
}