import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class StrPrac {
    public static void main(String[] args) {
        // String s="28 03 2024";
        // System.out.println(s.replace(' ','-'));
        // System.out.println(s.replace('9','-'));     //It returns the same string as before.

        // String l="Dear <|name|>, Thanks a lot";
        // System.out.println(l.replace("<|name|>","Happy"));
        
        // String s="hello";
        // if(s=="hello"){
        //     System.out.println(true);
        // }

        // String s1="#";
        // int a=Integer.parseInt(s1);
        // System.out.println(a);

        // Scanner sc=new Scanner(System.in);
        // String s=sc.nextLine();
        // String s1=sc.nextLine();
        // DateTimeFormatter a= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        // LocalDate d=LocalDate.parse(s,a);
        // LocalDate d1=LocalDate.parse(s1,a);
        // System.out.println(d);
        // System.out.println(d1);
        // Period p=Period.between(d,d1);
        // System.out.println(p.withDays(10));

        // try{
        //     System.out.println(1/0);    
        // }catch(Exception e){
        //     System.out.println("Cannot divide by 0");
        // }


        // Scanner sc=new Scanner(System.in);
        // String s=sc.nextLine();
        // String s1=sc.nextLine();
        // DateTimeFormatter a=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        // LocalDate d=LocalDate.parse(s,a);
        // LocalDate d1=LocalDate.parse(s1,a);

        // System.out.println(d.format(a));
        // System.out.println(d1.format(a));
        
        // Period p=Period.between(d,d1);
        // System.out.println(p);
        // System.out.println(p.getYears() + "Years" + p.getMonths() + "Months" + p.getDays() + "Days");

        

        // long g=ChronoUnit.DAYS.between(d,d1);
        // System.out.println(g);
        // sc.close();

        // Scanner sc=new Scanner(System.in);
        // int n=100;
        // int count=0;
        // int arr[]=new int[n];
        // for(int i=0;i<n ;i++){
        //     String s=sc.next();
        //     if(s.equals("#")) break;
        //     else{
        //         arr[i]=Integer.parseInt(s);
        //         count++;
        //     }
        // }
        // n=count;
        // for(int i=0;i<n;i++){
        //     System.out.println(arr[i]);
        // }

        // int n=532;
        // String s=String.valueOf(n);
        // String s0=Integer.toString(n);
        // System.out.println(s);
        // String s1=new StringBuilder(s).reverse().toString();
        // System.out.println(s1);

        Scanner sc=new Scanner(System.in);
        int n=5;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        sc.close();



    }
}
