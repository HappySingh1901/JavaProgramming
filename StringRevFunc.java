import java.util.Scanner;
public class StringRevFunc {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=new StringBuilder(s).reverse().toString();
        System.out.println(s1);
        sc.close();
    }
}
