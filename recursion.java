import java.util.Scanner;
public class recursion {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int res=fact(a);
        System.out.println("factorial of "+ a + " = " + res);
        sc.close();
    }
        public static int fact(int a) {
            if(a>=1){
                return a*fact(a-1);
            }else{
                return 1;
            }
        }
}
