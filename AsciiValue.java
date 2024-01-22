import java.util.Scanner;
public class AsciiValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch=sc.next().charAt(0);

        int num=(int) ch;
        System.out.println("The Ascii Value of the following char is " + num);
        sc.close();
    }
}
