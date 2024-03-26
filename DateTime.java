import java.time.LocalDate; // import the LocalDate class
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime {
    public static void main(String[] args) {
    LocalDate myObj = LocalDate.now(); // Create a date object
    System.out.println(myObj); // Display the current date
    LocalTime myObj1 = LocalTime.now(); 
    System.out.println(myObj1);
    LocalDateTime myObj2=LocalDateTime.now();
    System.out.println(myObj2); 
    }
}