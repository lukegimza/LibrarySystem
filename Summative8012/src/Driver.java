import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.*;
import java.util.*;


// Call number of books and users using users.size() and books.size()
public class Driver {

    // Fields
    static Scanner s = new Scanner(System.in);























}

/* <----- UNCOMMENT...



// Methods
private static void printMenu(){
// Displays menu for secretary for options
    System.out.println("--------------------------------");
    System.out.println("Main Menu:");
    System.out.println("f - Quit the Program.");
    System.out.println("b - Display information about all the books within the library.");
    System.out.println("u - Display information about all the users.");
    System.out.println("i - Update stored data when a book is issued to a user.");
    System.out.println("r - Update stored data when a user returns a book to the library.");
    System.out.println("--------------------------------");
    System.out.println("Type your answer in the form of a letter below and press ENTER:");
}




// View Slide 38 on Video 3
private static User readNames(){
//read and return names of the user - secretary inputs names to keyboard and this method retrieves the data
    System.out.println("Enter user firstname and surname please, and press ENTER.");
    String firstName = s.next();
    String surname = s.next();
    s.nextLine();
    return new User (firstName, surname); // CONSTRUCTOR FROM USER CLASS
}




// View Slide 38 on Video 3
private static Book readBooks(){
//read and return names of the user - secretary inputs names to keyboard and this method retrieves the data
    System.out.println("Enter user firstname and surname please, and press ENTER.");
    String firstName = s.next();
    String surname = s.next();
    s.nextLine();
    return new Book (bookName, bookID); // CONSTRUCTOR FROM BOOK CLASS
}

private static Book readBookData (Library library){
//read if any books are out with this user
    Book b = readBooks();
    if (library.bookNumber(b) == -1){
        System.out.println("Enter " + b + "id please, and press ENTER.");
        int id = s.nextInt();
        s.nextLine();
        return new Book(b.getBookName(), b.getBookAuther(), b.getBookID()); // GETTER FROM BOOK CLASS
    } else {
        return null;
    }
}

private static void checker(){
    // CASE R
    // Is the user a part of the library? See if their name matches the system.
    // If so what is the name of the book?
    // Tick the BOOLEAN that it's true that it's stored and returned in the library.
    // Use equals methods in the user class etc to check against user/book already existing.
}








 */