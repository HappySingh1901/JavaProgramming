import java.util.Scanner;
public class Replacewith {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.replace(" ", "#");
        System.out.println("The new string with replace by # is : " + s);
        sc.close();

    }
    
}
