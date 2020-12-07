import java.io.*;
import java.util.*;

public class Library {

    //**************************************************FIELDS********************************************************//

    // Scanner (data.txt) - 'inFile'
    Scanner inFile = new Scanner(new FileReader(
            "data.txt"));

    //**************************************************ARRAYLISTS****************************************************//

    // [Sorted]-Arraylists
    public SortedArrayList<User> users = new SortedArrayList<User>();
    public SortedArrayList<Book> books = new SortedArrayList<Book>();

    //**************************************************CONSTRUCTORS**************************************************//

    public Library() throws FileNotFoundException {
    }

    //**************************************************MAIN-[NONE]***************************************************//

    //**************************************************METHODS*******************************************************//

    // Getters (If required)
    public ArrayList<User> getUsers() {
        return users;
    }
    public ArrayList<Book> getBooks(){
        return books;
    }

    // [Line Analyser]-Reader
    public void reader () {
        int capacity = Integer.valueOf(inFile.nextLine());
        for (int i = 0; i < capacity; i++) {
            books.insert(new Book(inFile.nextLine(), inFile.nextLine()));
        }
        capacity = Integer.valueOf(inFile.nextLine());
        for (int i = 0; i < capacity; i++) {
            String[] elem = inFile.nextLine().split(" ");
            users.insert(new User(elem[0], elem[1]));
        }
    }

    // Reminder Message
    public void reminder (PrintWriter p, User u, Book b){
        p.println("Dear,");
        p.println(books.get(books.indexOf(Driver.bookSearch(b))).getLoner().getFullName());
        p.println("The book you have loaned:");
        p.println("\t'" + books.get(books.indexOf(Driver.bookSearch(b))).getBookInfo() + "'");
        p.println("\tHas been requested by another user.");
        p.println("\tPlease return it as soon as possible.");
        p.println("\nThank you for your cooperation:");
        p.println("The Library.\n");
        p.println("______________\n");

        p.flush();
    }

    public void soutInformer(Book b){
        System.out.println("Apologies, the book: ");
        System.out.println("\t'" + books.get(books.indexOf(Driver.bookSearch(b))).getBookInfo() + "'"
                + " is currently on loan right now.\n\tA notification has been dispatched " +
                "the current owner to return the book as soon as possible." +
                "\n\nThanks for your cooperation,\nThe Library.");
    }

    public void soutSuccessLoan(User u, Book b){
        System.out.println("The book: ");
        System.out.println("\t'" + books.get(books.indexOf(Driver.bookSearch(b))).getBookInfo() + "'");
        System.out.println("\tWas successfully loaned to the user: ");
        System.out.println("\t" + books.get(books.indexOf(Driver.bookSearch(b))).getLoner().getFullName());
        System.out.println("\nThanks for your cooperation,\nThe Library.");
    }

    public void soutSuccessReturn(User u, Book b){
        System.out.println("The book: ");
        System.out.println("\t'" + books.get(books.indexOf(Driver.bookSearch(b))).getBookInfo() + "'");
        System.out.println("\tWas successfully returned.");
        System.out.println("\nThanks for your cooperation,\nThe Library.");
    }
}
