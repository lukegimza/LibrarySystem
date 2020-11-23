import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Library{

    // Fields

    // Constructors

    // Main TESTER
    public static void main(String[] args) throws FileNotFoundException {
        Library.booksAndUsers();
    }

    // Methods
    public static void booksAndUsers () throws FileNotFoundException {
        // ArrayLists
        ArrayList<String> books = new ArrayList<>();
        ArrayList<String> users = new ArrayList<>();
        ArrayList<String> libraryList = new ArrayList<>();

    }

    public static void addBookToList (ArrayList<String> books){

    }

    public static void addUserToList (ArrayList<User> users, User printFullName){
        users.add(printFullName);
    }



}
