import java.util.Scanner;

public class fibonacci {
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of difits you want in the series ");
        int num2=sc.nextInt();
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for (int i=0;i<num2-2;i++){
            int c=a+b;
            a=b;
            b=c;
            System.out.println(a);
        }
        sc.close();

    }
    
}
