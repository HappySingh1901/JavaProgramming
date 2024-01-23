import java.util.Scanner;
public class armStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        String num3 = sc.nextLine();
        int length= num3.length();
        int num=Integer.parseInt(num3);
        int temp = num;
        int m=0;
        while(temp>0){
            int b=temp%10;
            m=m+ (int) Math.pow(b,length);
            temp=temp/10;
        }
        if (m==num){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong");
        }
        sc.close();
    }
}
