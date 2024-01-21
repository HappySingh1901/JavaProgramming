import java.util.Scanner;
public class armStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num3 = sc.nextInt();
        int temp = num3;
        int m=0;
        while(temp>0){
            int b=temp%10;
            m=m+ (int) Math.pow(b,3);
            temp=temp/10;
        }
        if (m==num3){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong");
        }
        sc.close();
    }
}
