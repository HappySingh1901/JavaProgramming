import java.time.LocalDate; // import the LocalDate class
import java.time.LocalTime;

public class DateTime {
    public static void main(String[] args) {
    LocalDate myObj = LocalDate.now(); // Create a date object
    System.out.println(myObj); // Display the current date
    LocalTime myObj1 = LocalTime.now();
    System.out.println(myObj1);
    }
}
