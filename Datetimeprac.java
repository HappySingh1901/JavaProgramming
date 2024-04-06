//import java.text.*;
import java.time.*;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.*;

public class Datetimeprac {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // LocalTime a=LocalTime.now();
        // System.out.println(a);
        // LocalDate b=LocalDate.now();
        // System.out.println(b);
        // LocalDateTime c=LocalDateTime.now();
        // System.out.println(c);

        // DateTimeFormatter d=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        // String e=c.format(d);
        // System.out.println(e);

        // //Some Example of ofPattern.
        // // yyyy-MM-dd	"1988-09-29"	
        // // dd/MM/yyyy	"29/09/1988"	
        // // dd-MMM-yyyy	"29-Sep-1988"	
        // // E, MMM dd yyyy	"Thu, Sep 29 1988"

        // String s=sc.nextLine();
        // String s1=sc.nextLine();
        // DateFormat date1=new SimpleDateFormat("dd-MM-yyyy");
        // Date a1=date1.parse(s);
        // Date a2=date1.parse(s1);
        

        // String s=sc.nextLine();
        // DateTimeFormatter d1 =DateTimeFormatter.ofPattern("dd-MM-yyyy");
        // LocalDate d = LocalDate.parse(s,d1);
        // LocalDate d2 = d.plusDays(177);
        
        // // LocalDate d2 = LocalDate.parse(d2,d1);
        // String d3=d2.format(d1);
        // System.out.println(d3);

        // Period p = Period.between(d, d2);
        // //int days=p.getDays();
        // System.out.println(p.getYears()+"years" + p.getMonths() + "Months" + p.getDays() + "days");

        // long dayss=ChronoUnit.DAYS.between(d,d2);
        // System.out.println(dayss);

        // long sun=ChronoUnit.WEEKS.between(d,d2);
        // System.out.println(sun);
        String s = sc.nextLine();
        String s1 = sc.nextLine();

        DateTimeFormatter d=DateTimeFormatter.ofPattern("mm-HH-ss");

        LocalTime t = LocalTime.parse(s,d);
        LocalTime t1 = LocalTime.parse(s1,d);

        String t2 = d.format(t);
        String t3 = d.format(t1);

        System.out.println(t2);
        System.out.println(t3);

        Duration dut = Duration.between(t,t1);;
        System.out.println(dut);

        long timee = ChronoUnit.MINUTES.between(t,t1);
        System.out.println(timee);

        sc.close();




    }
}
