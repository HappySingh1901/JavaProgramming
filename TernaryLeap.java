import java.util.Scanner;
public class TernaryLeap {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a Year To Whether it is a Leap year or not");
        int year =sc.nextInt();

        String result = ((year % 4 == 0) && (year % 100 !=0 )) ||  (year % 400 == 0) ? "a Leap Year" : "Not a Leap Year ";
        System.out.println(year + " is " + result);
        sc.close();
    }
}
