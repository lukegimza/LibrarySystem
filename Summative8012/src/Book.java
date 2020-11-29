public class Book {

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

    // Methods
    public String toString() {
        return bookName + " - " + bookAuthor;
    }

    // Compare-To Ordering
    public int compareTo(Book b) {
        int bkNmCmp = bookName.compareTo(b.bookName);
        if (bkNmCmp != 0) return bkNmCmp;
        int bkAuCmp = bookAuthor.compareTo(b.bookAuthor);
        if (bkAuCmp != 0) return bkAuCmp;
        else return 0;
    }

}
