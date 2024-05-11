import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Datetimeprac2 {

    public static void main(String[] args) {
        // Get the current date
        Date date = new Date();

        // Format the date using the default format
        DateFormat defaultFormat = DateFormat.getDateInstance();
        String defaultFormattedDate = defaultFormat.format(date);
        System.out.println("Default format: " + defaultFormattedDate);

        // Format the date in a specific format (e.g., "yyyy-MM-dd")
        SimpleDateFormat customFormat = new SimpleDateFormat("yyyy-MM-dd");
        String customFormattedDate = customFormat.format(date);
        System.out.println("Custom format (yyyy-MM-dd): " + customFormattedDate);
    }
}