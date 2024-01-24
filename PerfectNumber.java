import java.util.Scanner;;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int m = 0;
        for(int i=1 ; i < num ; i++){
            if(num % i== 0){
                m = m + i;
            }
        }
        if (m==num) {
            System.out.println(num + " is a Perfect Number");
        }else{
            System.out.println(num + " is not a Perfect Number" );
        }
        sc.close();
    }
}
