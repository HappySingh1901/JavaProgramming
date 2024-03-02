import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();
        int count = 0;
        String[] words = s.split("\\s+");
        count = words.length;
        System.out.println("Word Count: " + count);
        
        //or
        System.out.print("Enter a sentence: ");
        String s1 = sc.nextLine();
        int count1 = 0;
        String[] words1 = s1.split("\\s+");
        for (String word : words1) {
            count1++;
        }
        System.out.println("Word Count: " + count1);
        sc.close();
    }
}
