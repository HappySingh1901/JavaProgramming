import java.util.Scanner;
public class halfStrings {
    public static void main(String[] args){
        //The name should have even numbers of letters
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char arr[]=s.toCharArray();
        //first Half
        for(int i=0;i<=(s.length()-1)/2;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        //Second Half
        for(int i=s.length()/2;i<=s.length()-1;i++){
            System.out.print(arr[i]);
        }
        sc.close();
    }
}
