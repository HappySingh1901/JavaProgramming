import java.util.Scanner;
public class BinaryToDecimalConv {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int b=0;
        int i=0;
        while (num != 0){
            int m=num%10;
            b=(int)((m * Math.pow(2 , i ))+b);
            i++;
            num=num/10;
        }
        System.out.println(b);
        sc.close();
        
    }
}
