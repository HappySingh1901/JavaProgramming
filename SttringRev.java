import java.util.Scanner;
public class SttringRev {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        String empstr="";
        char ch;
        for(int i=0; i<str.length();i++){
            ch=str.charAt(i);
            empstr=ch+empstr;
        }
        System.out.println("Reversed word: "+ empstr);
        sc.close();
    }
}
