import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1 =sc.nextInt();
        int temp=num1;
        int m=0;
        while (temp>0){
            int b=temp%10;
            m=m*10+b;
            temp=temp/10;
        }
        if (m==num1){
            System.out.println("Pallindrome");
        }else{
            System.out.println("Not pallindrome");
        }
        sc.close();
    }
}
