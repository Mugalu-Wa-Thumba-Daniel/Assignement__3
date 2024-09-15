/*
//setTheBook.setCopiesAvailable(1);   setTheBook.Author = "Author";   setTheBook.Title = "Title";   setTheBook.ISBN = "978-1-940313-09-2-51799";
//Book addBorrowedBook = new Members("Tricia","24-276-BCSC-S", ["The Hst of th Dn Corp"];);

//Write a main method to demonstrate the functionality of your Library Management System.
//Create instances of `Book`, `Member`, and `Library`, and perform operations such as adding
//books, registering members, and lending books.
*/

public class Main {
    public static void main(String[] args) {
        Book setTheBook = new Book("The Hyper Space", "Danne Daniel Thumba", "978-1-940313-09-2-51799", 7);
        System.out.println("\n ##########################################################################################\n ########################################################################################## \n #### \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   #### \n #### \t\t\t\t\t\t\t\t THE BOOK CLASS \t\t\t\t\t\t\t\t   #### ");
        System.out.println(" #### \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   #### ");
        System.out.println(" ####  The Book yo have register has the title   : " + setTheBook.Title + "\t\t\t\t\t   ####" + "\n ####  The Author name is \t\t\t\t\t\t : " + setTheBook.Author + "\t\t\t\t   ####" + "\n ####  The International Standard Book Number is : " + setTheBook.ISBN + "\t\t\t   ####" + "\n ####  The number of Available copies is \t\t : " + setTheBook.copiesAvailable + "\t\t\t\t\t\t\t\t   ####");

        Members addMember = new Members("Tricia", "24-276-BSCS-S");
        addMember.addBorrowedBook("The Corpuscle Wave Daulity");
        System.out.println(" #### \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   #### \n ##########################################################################################\n ########################################################################################## \n #### \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   #### \n #### \t\t\t\t\t\t\t\t THE MEMBERS CLASS \t\t\t\t\t\t\t\t   #### ");
        System.out.println(" #### \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   #### ");
        System.out.println(" ####  You adde a new member : " + addMember.Name+ "\t\t\t\t\t\t\t\t\t\t\t\t   ####"  + "\n ####  His/Her Id is \t\t : " + addMember.MemberId+ "\t\t\t\t\t\t\t\t\t\t   ####");
        System.out.println(" ####  The Borrowed Book is  : " + addMember.BorrowedBooks + "\t\t\t\t\t\t\t   ####");
        System.out.println(" #### \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   #### \n ##########################################################################################\n ########################################################################################## \n #### \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   #### \n #### \t\t\t\t\t\t\t\t THE LIBRARY CLASS \t\t\t\t\t\t\t\t   #### ");
        System.out.println(" #### \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   #### ");

        Library getLabFunctions = new Library("Quantum Mechanics","Thod", "527-1-650318-07-5-97384", "24-276-BSCS-S");
        System.out.println(" ####  The first book added in the Library is   : " + getLabFunctions.Books + " \t\t\t\t   #### \n ####  It International Standard Book Number is : "+ getLabFunctions.ISBN_2 +"\t\t\t   #### " + "\n ####  The first member added in the Library is : " + getLabFunctions.Members + " \t\t\t\t\t\t\t   #### ");
        getLabFunctions.addBook("\n\t\t\tThe Hyper Space\n");
        getLabFunctions.addBook("\t\t\tThe Corpuscle Wave Daulity\n");
        getLabFunctions.addBook("\t\t\tThe Thermodynamics Theories\n");
        getLabFunctions.addMember("\n\t\t\tTricie\n");
        getLabFunctions.addMember("\t\t\tThed\n");
        getLabFunctions.addMember("\t\t\tThalia\n");
        System.out.println(" #### \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   #### ");
        System.out.println(" ####  BOOKS OF THE LIBRARY ARE : \t\t\t\t\t\t\t\t\t\t\t\t\t   #### \n #### \t\t" +getLabFunctions.Books + "#### \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   ####");
        System.out.println(" ####  MEMBERS OF THE LIBRARY ARE : \t\t\t\t\t\t\t\t\t\t\t\t   #### \n\t\t\t" +getLabFunctions.Members);
        System.out.println(" #### \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   #### ");

        getLabFunctions.findBookByIsbn("Quantum Mechanics","527-1-650318-07-5-97384");
        System.out.println(" #### \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   #### ");
        getLabFunctions.lendBook("Quantum Mechanics", "24-276-BSCS-S");
        System.out.println(" #### \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   #### ");
        getLabFunctions.findMemberById("Thod", "24-276-BSCS-S");

        System.out.println(" #### \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   #### ");
        System.out.println(" ##########################################################################################\n ########################################################################################## ");
    }
}
