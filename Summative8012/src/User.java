import java.io.*;
import java.util.*;

public class User implements Comparable<User> {
    // Users List
    public void usersList () {
        ArrayList<User> zoeB = new ArrayList<>();
        ArrayList<User> annaB = new ArrayList<>();
        ArrayList<User> johnS = new ArrayList<>();
        ArrayList<User> johnW = new ArrayList<>();
    }

    // Fields
    private String firstName;
    private String surname;
    private int bookAmount = 0;
    private int maxbk = 3;

    // Constructors
    public User(){
        firstName = "";
        surname = "";
    }
    public User(String nameFirst, String nameLast){
        firstName = nameFirst;
        surname = nameLast;
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

    //**************************************************METHODS*******************************************************//

    public void setFullName (String nameFirst, String nameLast){
        firstName = nameFirst;
        surname = nameLast;
    }

    // Getters if required
    public String getFullName (){
        return firstName + " " + surname + ".";
    }
    public String getFirstName(){
        return firstName;
    }
    public String getSurname(){
        return surname;
    }
    public String toString(){
        String bookAmtMessage = "Book amount: " + bookAmount;
        if (bookAmount >= maxbk) {

        }
        return firstName + " " + surname + ".\n"
                + bookAmtMessage;
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

    public void increment (){
        if (bookAmount < 3){
            bookAmount++;
        }
    }

    public void decrement (){
        if (bookAmount > 0){
            bookAmount--;
        }
    }

    public int getBookAmount(){
        return bookAmount;
    }
}
