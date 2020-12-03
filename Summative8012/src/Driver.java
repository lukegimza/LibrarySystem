import java.io.*;
import java.util.*;


// Call number of books and users using users.size() and books.size()
public class Driver {
    static PrintWriter outFile;
    static {
        try {
            outFile = new PrintWriter("Z:/Normal_Files/University/MScComputerScienceFiles/8012/Summative/Data/results.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Fields
    static Scanner s = new Scanner(System.in);
    static Library l;
    static {
        try {
            l = new Library();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    static Driver d;
    static {
        try {
            d = new Driver();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Constructors
    public Driver() throws FileNotFoundException {
    }

    // Main
    public static void main(String[] args) {
        //d.runSelection();
        l.addUser(l.recordUser());
        l.addBook(l.recordBook());
        outFile.println(l.getUsers());
        outFile.println(l.getBooks());
    }

    // Run Selection
    public void runSelection(){
//        l.addUser(recordUser());
//        l.addBook(recordBook());
//        l.getUsers());
//        l.getBooks());

        boolean exit = false;
        while (!exit){
            printMenu();
            char choice = s.next().charAt(0);
            s.nextLine();
            switch(choice){
                case 'f':
                    System.out.println("Quitting the program. Thank you.");
                    exit = true;
                    break;
                case 'b':
                    System.out.println("Total book information: ");
                    break;
                case 'u':
                    System.out.println("Total user information: ");
                    l.getUsers();
                    break;
                case 'i':
                    System.out.println("Update book loan OUT data: ");
                    break;
                case 'r':
                    System.out.println("Update loan IN data: ");
                    break;
                default:
                    System.out.println("Invalid input. Please input a single character shown in the menu.");
            }
            s.nextLine();
        }
        outFile.close();
    }

    //**************************************************METHODS*******************************************************//

    private static void printMenu() {
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
    // Read User
    public static User readUser(){
        return null;
    }



    // Read Book



























}

/* <----- UNCOMMENT...



// Methods





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