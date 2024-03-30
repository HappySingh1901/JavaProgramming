import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTime2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        DateTimeFormatter d1 =DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate d = LocalDate.parse(s,d1);
        LocalDate d2 = d.plusDays(177);
        
        String d3=d2.format(d1);
        System.out.println(d3);

        Period p = Period.between(d, d2);
        //int days=p.getDays();
        System.out.println(p.getYears()+"years" + p.getMonths() + "Months" + p.getDays() + "days");

        long dayss=ChronoUnit.DAYS.between(d,d2);
        System.out.println(dayss);
        sc.close();
    }
}
