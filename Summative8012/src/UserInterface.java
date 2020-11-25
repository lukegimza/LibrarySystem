import java.time.LocalDate;

public interface UserInterface {

    String getUserFullName();
    String getUserFirstName();
    String getUserSurname();
    LocalDate getUserBday();
    int getUserAge();
}
