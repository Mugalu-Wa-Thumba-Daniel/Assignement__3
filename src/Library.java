/*
    private Book[] books = new Book[10];
    private Members[] members = new Members[10];

    public Library(Book[] books, Members[] members) {
        this.books = books;
        this.members = members;
    }
    public Book[] getBooks() {
        return books;
    }
    public Members[] getMembers() {
        return members;
    }

    public Library() {
        for (int i = 0; i < 10; i++) {
            books[i] = null;
            members[i] = null;
        }
    }

    for (int i = 0; i < 10; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
    }

    for (int i = 0; i < 10; i++) {
            if (members[i] == null) {

            }
    }

    for (int i = 0; i < 10; i++) {
            if (books[i].getISBN().equals(ISBN)) {

            }
    }

    public void lendMember(String MemberId){
        for (int i = 0; i < 10; i++) {
            if (members[i].getMemberId().equals(MemberId)) {

            }
        }
    }

    private Book findBookByIsbn(String ISBN) {
        for (int i = 0; i < 10; i++) {
            if (books[i].getISBN().equals(ISBN)) {
                return books[i];
            }
        }
        return null;
    }

    private Member findMemberById(String MemberId) {
        for (int i = 0; i < 10; i++) {
            if (members[i].getMemberId().equals(MemberId)) {

            }
        }
        return null;
    }
*/

import java.lang.String;
import java.lang.reflect.Member;
import java.util.ArrayList;

public class Library {
    ArrayList<String> Books = new ArrayList<>();
    ArrayList<String> Members = new ArrayList<String>();
    ArrayList<String> ISBN_2 = new ArrayList<String>();
    ArrayList<String> MemberId_2 = new ArrayList<String>();

    // Constructor to initialize books and members lists.
    public Library(String Books, String Members, String ISBN_2, String MemberId2) {
        this.Books.add(Books);
        this.ISBN_2.add(ISBN_2);
        this.Members.add(Members);
        this.MemberId_2.add(MemberId2);
    }

    public ArrayList<String> getBooks(){
        return this.Books;
    }
    public ArrayList<String> getMembers(){
        return this.Members;
    }
    public ArrayList<String> getISBN2(){
        return this.ISBN_2;
    }
    public ArrayList<String> getMemberId2(){
        return this.MemberId_2;
    }

    // Method to add a Book to the library.
    public void addBook(String BookAdded) {
        this.Books.add(BookAdded);
    }

    // Method to register a new member.
    public void addMember(String member) {
        this.Members.add(member);
    }

    // Method to lend a book to a member.
    public void lendBook(String BookL, String MemberId){
        for (int i = 0; i < this.Books.size(); i++) {
            this.Books.get(i).equals(BookL);
            this.Members.get(i).equals(MemberId);

            if(Books.get(i).equals(BookL) ) {
                System.out.println(" ####  THE BOOK YOU WAND TO LEND IS : " + BookL + "\t\t\t\t\t\t\t\t   #### ");
            }
        }
    }

    //  Helper method to find a book by ISBN.
    public void  findBookByIsbn(String Book, String Isbn) {
        for (int i = 0; i < this.Books.size(); i++) {
            if (this.Books.get(i).equals(Book) && this.ISBN_2.get(i).equals(Isbn)) {
                System.out.println(" ####  THE BOOK YOU ARE LOOKING FOR IS \t\t\t: " + Book + "\t\t\t\t\t   #### \n ####  IT INTERNATIONAL STANDARD BOOK NUMBER IS : " + Isbn + " \t\t\t   ####");
            }
        }
    }

    // Helper method to find a member by their ID.
    public void findMemberById(String Member_2, String MemberId_2) {
        for (int i = 0; i < this.Members.size(); i++) {
            if (this.Members.get(i).equals(Member_2) && this.MemberId_2.get(i).equals(MemberId_2)) {
                System.out.println(" ####  THE MEMBER YOU ARE LOOKING FOR IS : " + Member_2 + " \t\t\t\t\t\t\t\t\t   #### \n ####  HIS/HER MEMBER ID IS \t\t\t : " + MemberId_2 + "\t\t\t\t\t\t\t   ####");
            }
        }
    }
    //Check if the book is available and if so, lend it to the member by adding it to their borrowed
    //books list and decrementing the number of available copies.
}
