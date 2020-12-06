import java.io.*;
import java.util.*;

public class Library {
    Scanner inFile = new Scanner(new FileReader(
            "data.txt"));

    // List
    public SortedArrayList<User> users = new SortedArrayList<User>();
    public SortedArrayList<Book> books = new SortedArrayList<Book>();

    // Fields

    // Constructors
    public Library() throws FileNotFoundException {
    }

    //**************************************************METHODS*******************************************************//

    // Reader
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
    // Getters
    public ArrayList<User> getUsers() {
        return users;
    }
    public ArrayList<Book> getBooks(){
        return books;
    }

    public void reminder (PrintWriter p, User u, Book b){
        p.println("Dear,");
        p.println(books.get(books.indexOf(Driver.bookSearch(b))).getLoner().getFullName());
        p.println("The book you have loaned:");
        p.println("'" + books.get(books.indexOf(Driver.bookSearch(b))).getBookInfo() + "'");
        p.println("Has been requested by another user.");
        p.println("Please return it as soon as possible.");
        p.println("Thank you for your cooperation:");
        p.println("The Library.");

        p.flush();
    }
}
