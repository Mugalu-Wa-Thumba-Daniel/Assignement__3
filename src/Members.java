// uy import javax.lang.model.element.Name;
//private String MemberId;
//private ArrayList<String> BorrowedBook = new ArrayList<String>();
/*
    private Book[] BorrowedBook = new Book[10];

    public Members(String Name, String MemberId, Book[] BorrowedBook) {
        this.Name = Name;
        this.MemberId = MemberId;
        this.BorrowedBook = BorrowedBook;
    }

    public Book[] getBorrowedBook() {
        return BorrowedBook;
    }

    //Method to add a book to borrowedBooks.
    public void addBorrowedBook(Book TheBorrowedBook) {
        for (int i = 0; i < 10; i++) {
            if (BorrowedBook[i] == null) {
                BorrowedBook[i] = TheBorrowedBook;
                break;
            }
        }
    }
*/

import java.util.ArrayList;
import java.lang.String;

public class Members {

    public String Name;
    public String MemberId;
    public ArrayList<String> BorrowedBooks = new ArrayList<String>();

    // Constructor to initialize name and memberId.
    public Members(String Name, String MemberId) {
        this.Name = Name;
        this.MemberId = MemberId;
    }

    // Getter for memberName.
    public String getName() {
        return Name;
    }

    // Getter for memberId.
    public String getMemberId() {
        return MemberId;
    }

    // Getter for BorrowedBooks.
    public ArrayList<String> getBorrowedBooks() {
        return BorrowedBooks;
    }

    // - Method to add a book to borrowedBooks.
    public void addBorrowedBook(String NewBorrowedBook) {
        BorrowedBooks.add(NewBorrowedBook);
    }
}