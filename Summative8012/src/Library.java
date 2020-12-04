import java.io.*;
import java.util.*;

public class Library {
    Scanner inFile = new Scanner(new FileReader(
            "data.txt"));

    // List
    public SortedArrayList<User> users = new SortedArrayList<User>();
    public SortedArrayList<Book> books = new SortedArrayList<Book>();

    // Fields
    private int bookAmount;
    private int maxBooks = 3;
    private boolean loan;

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
    // Max book limit
    public boolean maxBookLimit(){
        if (bookAmount > 3 || bookAmount < 0){
            return true;
        } else {
            return false;
        }
    }
    // Getters
    public ArrayList<User> getUsers () {
        return users;
    }
    public ArrayList<Book> getBooks(){
        return books;
    }

}
