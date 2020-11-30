public class Book implements Comparable<Book>{

    // Fields
    private String bookName;
    private String bookAuthor;
    private boolean loan;

    // Constructors
    public Book(){
        bookName = "";
        bookAuthor = "";
    }
    public Book (String bookNm, String bookAu, boolean onLoan){
        bookName = bookNm;
        bookAuthor = bookAu;
        loan = onLoan;
    }

    // Methods
    public String toString() {
        return bookName + " - " + bookAuthor + ". On loan? - " + loan;
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
