import java.io.*;
import java.util.*;

public class Library {
    Scanner inFile = new Scanner(new FileReader("Z:/Normal_Files/University/MScComputerScienceFiles/8012/Summative/Data/data.txt"));

    // List
    public ArrayList<User> users = new ArrayList<User>();
    public ArrayList<Book> books = new ArrayList<Book>();
    public ArrayList<User> sortedUserList = new ArrayList<>();
    public ArrayList<Book> sortedBookList = new ArrayList<>();

    // Fields
    private int bookAmount;
    private int maxBooks = 3;

    private boolean loan;

    // Constructors
    public Library() throws FileNotFoundException {
    }

    public static void Manage() {
        // Users
        User luke = new User ("Luke", "Gimza");
        User hazel = new User ("Hazel", "Stink");
        User alexa = new User ("Alexa", "Lynch");
        User gerry = new User ("Gerry", "Richardson");
        User sam = new User ("Sam", "Heatley");
        // Books
        Book starwars = new Book ("Star Wars", "George Lucas");
        Book lotr = new Book ("Lord of the Rings", "J. R. R. Tolkien");
        Book wow = new Book ("World of Warcraft", "Christie Golden");
        Book omam = new Book ("Of Mice and Men", "John Steinbeck");
        Book aic = new Book ("An Inspector Calls", "J. B. Priestley");
    }

    //**************************************************METHODS*******************************************************//

    // Record User
    public User recordUser (){
        String firstName = inFile.next();
        String surname = inFile.next();
        inFile.nextLine();

        User u = new User(firstName, surname);
        addUser(u);
        return u;
    }
    // Record Book
    public Book recordBook () {
        String bookName = inFile.nextLine();
        String bookAuthor = inFile.nextLine();
        inFile.nextLine();

        Book b = new Book(bookName, bookAuthor);
        addBook(b);
        return b;
    }

    // Record User
    public boolean addUser(User u){
        if (!users.contains(u)){
            return users.add(u);
        } else {
            return false;
        }
    }
    // Record Book
    public boolean addBook(Book b){
        if (!books.contains(b)){
            return books.add(b);
        } else {
            return false;
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
