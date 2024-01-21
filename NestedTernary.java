import java.util.Scanner;
public class NestedTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter num1");
        int num1 = sc.nextInt();
        System.err.println("Enter num2");
        int num2 = sc.nextInt();

        String result = (num1 > num2) ? "Greater than" : (num2 > num1) ? "Less than" : "Equal to";
        System.out.println(num1 + " is " + result + " " + num2);
        sc.close();
    }
}
