import java.util.Scanner;
public class function {
    int add(int a,int b){
        int c=a+b;
        return c;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        function obj=new function();
        int sum=obj.add(a,b);
        System.out.println("The sum of the two numbers is: " + sum);
        sc.close();

    }
}
