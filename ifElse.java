import java.util.Scanner;
public class ifElse {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int age= sc.nextInt(); 
        if (age <0) {
            System.out.println("Enter valid age");
        }
        if (age>0){
            if ( 1 < age && age < 18 ){
                System.out.println("You are nt eligible for voting");
            }else{
                System.out.println("You are eligible to vote");
            }
        }
        sc.close();
    }
}
