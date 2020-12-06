import java.io.*;
import java.util.*;

public class Book implements Comparable<Book>{
    // Fields
    private String bookName;
    private String bookAuthor;
    public boolean loan = false;
    public User userLoaned = null;


    // Constructors
    public Book(){
        bookName = "";
        bookAuthor = "";
    }
    public Book (String bookNm, String bookAu){
        bookName = bookNm;
        bookAuthor = bookAu;
    }

    //**************************************************METHODS*******************************************************//

    public String toString() {
        String checkMessage = "Available";
        if (loan == true){
            checkMessage = "Not " + checkMessage + " - Current Holder: " + userLoaned + ".";
        }
        return bookName + " - " + bookAuthor + ":\n"
                + checkMessage;
    }

    public void setUser(User user){
        if (userLoaned == null){
            userLoaned = user;
            loan = true;
        }
    }

    public void setUserNull(){
        userLoaned = null;
        loan = false;
    }

    public User getLoner(){
        return userLoaned;
    }

    public String getBookInfo(){
        return bookName + " - " + bookAuthor + ".";
    }

    public String splitLN(){
        String[] elements = bookAuthor.split(" ");
        return elements[elements.length - 1];
    }
    // Compare-To Ordering
    @Override
    public int compareTo(Book b) {
        int bkAuCmp = splitLN().compareTo(b.splitLN());
        if (bkAuCmp != 0) return bkAuCmp;
        int bkNmCmp = bookName.compareTo(b.bookName);
        if (bkNmCmp != 0) return bkNmCmp;
        else return 0;
    }

}
