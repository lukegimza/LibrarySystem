import java.io.*;
import java.util.*;

public class Driver {

    //**************************************************FIELDS********************************************************//

    // PrintWriter (results.txt) - 'outFile'
    static PrintWriter outFile;
    static {
        try {
            FileWriter f = new FileWriter("results.txt", true);
            outFile = new PrintWriter(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // Scanner (System-in) - 's'
    static Scanner s = new Scanner(System.in);
    // Library (Object) - 'l'
    static Library l;
    static {
        try {
            l = new Library();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    // Driver (Object) - 'd'
    static Driver d;
    static {
        try {
            d = new Driver();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //**************************************************ARRAYLISTS-[NONE]*********************************************//

    //**************************************************CONSTRUCTORS**************************************************//

    public Driver() throws FileNotFoundException {
    }

    //**************************************************MAIN**********************************************************//

    public static void main(String[] args) {
        d.runMainSelection();
    }

    //**************************************************METHODS*******************************************************//

    // Run Selection
    private void runMainSelection(){
        boolean exit = false;
        l.reader();
        while (!exit){
            printMainMenu();
            char choice = s.next().charAt(0);
            s.nextLine();
            switch(choice){
                case 'f':
                    System.out.println("Quitting the program. Thank you.");
                    exit = true;
                    break;
                case 'b':
                    System.out.println("TOTAL BOOK AMOUNT: " + l.getBooks().size()
                            + "\nTOTAL BOOK INFORMATION:");
                    for (Book b : l.getBooks()){
                        System.out.println("______________\n" + b);
                    }
                    break;
                case 'u':
                    System.out.println("TOTAL USER AMOUNT: " + l.getUsers().size()
                            + "\nTOTAL USER INFORMATION:");
                    for (User u : l.getUsers()){
                        System.out.println("______________\n" + u);
                    }
                    break;
                case 'i':
                    User uU = userSearch(readNameInput());
                    Book bU = bookSearch(readBookInput());
                    if (uU != null && bU != null){
                        Book bk = l.getBooks().get(l.getBooks().indexOf(bookSearch(bU)));
                        // PRINTWRITER REMINDER IF SOMEONE HAS BOOK ALREADY ON LOAN
                        if (bk.loan == true){
                            l.soutInformer(bU);
                            l.reminder(outFile, uU, bU);
                        } else {
                            if (uU.getBookAmount() < 3){
                                bk.setUser(uU);
                                uU.increment();
                                l.soutSuccessLoan(uU, bU);
                            } else {
                                System.out.println("You can't loan anymore books!");
                            }
                        }
                    } else if (uU == null && bU != null){
                        System.out.println("You have inputted incorrect user credentials.");
                    } else if (bU == null && uU != null){
                        System.out.println("You have inputted incorrect book credentials.");
                    } else {
                        System.out.println("You haven't input any valid information.");
                    }
                    break;
                case 'r':
                    User uB = userSearch(readNameInput());
                    Book bB = bookSearch(readBookInput());
                    if (uB != null && bB != null){
                        Book bk = l.getBooks().get(l.getBooks().indexOf(bookSearch(bB)));
                        if (uB.getBookAmount() > 0){
                            bk.setUserNull();
                            uB.decrement();
                            l.soutSuccessReturn(uB, bB);
                        } else {
                            System.out.println("You don't have any books!");
                        }
                    } else if (uB == null && bB != null){
                        System.out.println("You have inputted incorrect user credentials.");
                    } else if (bB == null && uB != null){
                        System.out.println("You have inputted incorrect book credentials.");
                    } else {
                        System.out.println("You haven't put any valid information in.");
                    }
                    break;
                default:
                    System.out.println("Invalid input. Please input a single character shown in the menu.");
            }
            s.nextLine();
        }
        outFile.close();
    }

    // Main Menu Display
    private void printMainMenu() {
        // Displays menu for secretary for options
        System.out.println("Welcome to The Library.");
        System.out.println("--------------------------------");
        System.out.println("Main Menu:");
        System.out.println("f - Quit the Program.");
        System.out.println("b - Display information about all the books within the library.");
        System.out.println("u - Display information about all the users.");
        System.out.println("i - Update stored data when a book is issued to a user.");
        System.out.println("r - Update stored data when a user returns a book to the library.");
        System.out.println("--------------------------------");
        System.out.println("Type your answer in the form of a letter below. Press 'ENTER' to submit" +
                " and 'ENTER' again to continue:");
    }

    // Reading Name Input From Scanner
    public static User readNameInput(){
    //read and return names of the user - secretary inputs names to keyboard and this method retrieves the data
        System.out.println("Enter user firstname and surname please, and press ENTER. " +
                "[CASE SENSITIVE]");
        String firstName = s.next();
        String surname = s.next();
        s.nextLine();
        return new User (firstName, surname);
    }

    // Reading Book Input From Scanner
    public static Book readBookInput(){
        System.out.println("Enter the book name please, and press ENTER. [CASE SENSITIVE]");
        String bookName = s.nextLine();
        System.out.println("Enter the book author please, and press ENTER. [CASE SENSITIVE]");
        String bookAuthor = s.nextLine();
        s.nextLine();
        return new Book (bookName, bookAuthor);
    }

    // Search User Arraylist - Referenced generic search code from 'Big Java Early Objects chapter.14'
    public static User userSearch(User u){
        for (int i = 0; i < l.getUsers().size(); i++){
            User u2 = l.getUsers().get(i);
            int p = u.compareTo(u2);
            if (p == 0){
                return u2;
            }
        }
        return null;
    }

    // Search Book Arraylist - Referenced generic search code from 'Big Java Early Objects chapter.14'
    public static Book bookSearch(Book b){
        for (int i = 0; i < l.getBooks().size(); i++){
            Book b2 = l.getBooks().get(i);
            int pb = b.compareTo(b2);
            if (pb == 0){
                return b2;
            }
        }
        return null;
    }


}