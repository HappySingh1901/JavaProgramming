import java.util.Scanner;
import java.util.Arrays;
public class String1 {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        String s1=sc.nextLine();
        // int n1=s.length();
        // int n2=s1.length();
        // if(n1!=n2){
        //     System.out.println(s + " and " + s1 + " are not anagrams.");     //not required
        // }
        s=s.replaceAll("\\s", "").toLowerCase();
        s1=s1.replaceAll("\\s", "").toLowerCase();

        char[] charArray1=s.toCharArray();
        char[] charArray2=s1.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        if(Arrays.equals(charArray1,charArray2)){
            System.out.println(s + " and " + s1 + " are anagrams.");
        }else{
            System.out.println(s + " and " + s1 + " are not anagrams.");
        }
        sc.close();
    }
}
