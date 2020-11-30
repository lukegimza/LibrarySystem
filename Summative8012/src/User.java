import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class User implements Comparable<User> {

    // Fields
    private String firstName;
    private String surname;
    private int bookAmount;
    private int maxBooks = 3;

    // Constructors
    public User(){
        firstName = "";
        surname = "";
    }
    public User(String nameFirst, String nameLast, int bookAmt){
        firstName = nameFirst;
        surname = nameLast;
        bookAmount = bookAmt;
    }

    // Printing
    public void printFullName (PrintWriter p){
        p.println(firstName + " " + surname);
    }
    public String printFullNameInitials(){
        return firstName.charAt(0) + "." + surname.charAt(0) + ".";
    }
    public void printSmallName (PrintWriter p){
        p.print(printFullNameInitials() + ". " + surname);
    }
    public boolean equalTo (User otherUser){
        return (firstName.equals(otherUser.firstName) && surname.equals(otherUser.surname));
    }

    // Methods
    public void setFullName (String nameFirst, String nameLast){
        firstName = nameFirst;
        surname = nameLast;
    }
    // Getters if required
    public String getFirstName(){
        return firstName;
    }
    public String getSurname(){
        return surname;
    }
    public String toString(){
        return firstName + " " + surname + " - " + bookAmount + " book(s)";
    }
    // Compare-To Ordering
    @Override
    public int compareTo(User u) {
        int surCmp = surname.compareTo(u.surname);
        if (surCmp != 0)
            return surCmp;
        int firstCmp = firstName.compareTo(u.firstName);
        if (firstCmp != 0)
            return firstCmp;
        else return 0;
    }
    // Max book limit
    public boolean maxBookLimit(){
        if (bookAmount > 3 || bookAmount < 0){
            return true;
        } else {
            return false;
        }
    }

}
