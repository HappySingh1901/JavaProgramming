import java.util.Scanner;
public class StringToArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char c[]=s.toCharArray();
        int n=s.length();
        for(int i=0;i<n;i++){
            System.out.println(c[i]);
            
        } 
        sc.close();
    }
}
