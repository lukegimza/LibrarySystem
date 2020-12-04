import java.io.*;
import java.util.*;

public class Book implements Comparable<Book>{
    // Fields
    private String bookName;
    private String bookAuthor;

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

    public String splitLN(){
        String[] elements = bookAuthor.split(" ");
        return elements[elements.length - 1];
    }

    public String toString() {
        return bookName + " - " + bookAuthor;
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
