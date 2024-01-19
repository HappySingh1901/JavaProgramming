import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Integer array

        int num=sc.nextInt();
        int[] arr=new int[num];
        for (int i = 0 ; i < num ; i++){                        //Loop to get input for Integer array.
            arr[i] = sc.nextInt();
        }
        for (int i = 0 ; i < num ; i++){                        //Loop to display array Elements.
            System.out.println(arr[i]);
        }
        System.out.println(arr[2]);                             //Accesing elements using Index.



        //Char array

        int num1 = sc.nextInt();
        sc.nextLine();                                         //Consume the newline character left in the buffer.
        String[] strarr=new String[num];
        for (int i = 0 ; i < num1 ; i++){                      //Loop to get input for char array
            strarr[i] = sc.nextLine();
        }
        for (int i = 0 ; i < num1 ; i++){                      //Lop to display array Elemnets.
            System.out.println(strarr[i]);
        }
        System.out.println(strarr[2]);                         //Accesing elements using Index.
        sc.close();

    }
}
