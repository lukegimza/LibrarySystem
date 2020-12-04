import java.io.*;
import java.util.*;

public class User implements Comparable<User> {
    // Fields
    private String firstName;
    private String surname;

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
    public boolean equalTo (User otherUser){
        return (firstName.equals(otherUser.firstName) && surname.equals(otherUser.surname));
    }

    //**************************************************METHODS*******************************************************//

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
        return firstName + " " + surname;
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


}
