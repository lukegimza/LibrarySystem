

import java.util.ArrayList;
import java.util.Collections;

public class SortedArrayList extends ArrayList{

    // Fields
    private User user;
    private Book book;


    // Constructors
    public SortedArrayList (User firstElement, Book secondElement){
        user = firstElement;
        book = secondElement;
    }

    // ArrayLists
    public static void main(String[] args) {
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
        // List
        ArrayList<User> users = new ArrayList<User>();
        ArrayList<Book> books = new ArrayList<Book>();
        // Adding users to list
        users.add(luke);
        users.add(hazel);
        users.add(alexa);
        users.add(gerry);
        users.add(sam);
        // Adding books to list
        books.add(starwars);
        books.add(lotr);
        books.add(wow);
        books.add(omam);
        books.add(aic);
        // Sorting
        Collections.sort(users);
        System.out.println(users);
        System.out.println(minU(users));
        System.out.println(books);
        //System.out.println(minB(books));
    }


    // Methods
    // Slide 37, Section 2.
    public static <E extends Comparable<E>> E minU (ArrayList<E> u){
        E uSoFar = u.get(0);
        for (E elem: u)
            if (elem.compareTo(uSoFar) < 0) uSoFar = elem;
        return uSoFar;
    }

    public static <E extends Comparable<E>> E minB (ArrayList<E> b) {
        E bSoFar = b.get(0);
        for (E elem : b)
            if (elem.compareTo(bSoFar) < 0) bSoFar = elem;
        return bSoFar;
    }







}