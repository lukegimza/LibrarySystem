import java.io.*;
import java.util.*;

public class User implements Comparable<User> {

    //**************************************************FIELDS********************************************************//

    private String firstName;
    private String surname;
    private int bookAmount = 0;
    private int maxbk = 3;

    //**************************************************ARRAYLISTS-[NONE]*********************************************//

    //**************************************************CONSTRUCTORS**************************************************//

    public User(){
        firstName = "";
        surname = "";
    }
    public User(String nameFirst, String nameLast){
        firstName = nameFirst;
        surname = nameLast;
    }

    //**************************************************MAIN-[NONE]***************************************************//

    //**************************************************METHODS*******************************************************//

    // Set Full-Name
    public void setFullName (String nameFirst, String nameLast){
        firstName = nameFirst;
        surname = nameLast;
    }

    // Getters (If required)
    public String getFullName (){
        return firstName + " " + surname + ".";
    }
    public String getFirstName(){
        return firstName;
    }
    public String getSurname(){
        return surname;
    }
    public int getBookAmount(){
        return bookAmount;
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

    // User Output-[To-String]
    public String toString(){
        String bookAmtMessage = "Book amount: " + bookAmount;
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

    // i++ && i--
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


}
