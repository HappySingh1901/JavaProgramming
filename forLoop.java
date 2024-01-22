import java.util.Scanner;
public class forLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1 = sc.nextInt();


        //Table

        for (int i=1;i<11;i++){
            System.out.println(num1 + " X " + i + " = " + num1 * i);
        }
        System.out.println();


        //Square Pattern

        for (int i=0;i<num1;i++){                                       //If num1=5
            for (int j=0;j<num1;j++){                                   //      * * * * *
                System.out.print("* ");                               //      * * * * *
            }                                                           //      * * * * * 
            System.out.print("\n");                                   //      * * * * * 
        }                                                               //      * * * * * 


        //Half triangle
        for (int i=0;i<num1; i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }


        for (int i=num1;i>0;i--){
            for (int j=i ;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

        
        for (int i = 0 ; i < num1 ; i++){
            for (int j = 0 ; j < i ; j++){
                System.out.print("  ");
            }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
            for (int k = i ; k < num1 ; k++){
                System.out.print(" *");
            }
            System.out.println();
        }


        for (int i = 1 ; i < num1+1 ; i++){
            for (int k = i ; k < num1 ; k++){
                System.out.print("  ");
            }
            for (int j = 0 ; j < i ; j++){
                System.out.print(" *");
            }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
            System.out.println();
        }
        sc.close();

    }
}
