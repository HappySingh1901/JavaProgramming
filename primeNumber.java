import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean a=true;
        for (int i=2 ; i < num ; i++ ){
            if (num % i == 0){
                a=false;
                break;
            }else{
                a=true;
            }
        }
        if (a==false){
            System.out.println("Not Prime");
        }else{
            System.out.println("Prime");
        }
        sc.close();
        
    }
}
