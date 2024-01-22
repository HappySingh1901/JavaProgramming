import java.util.Scanner;
public class ReverseInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int b=0;
        while(num>0){
            int m = num%10;
            b = b*10+m;
            num=num/10; 
        }
        System.out.println("The reverse of the given number is " + b);
        sc.close();
    }
}
