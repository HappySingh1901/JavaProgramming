// public class first{
//     public static void main(String[] args){
//         System.out.print("Helllo World");
//     }
// }
import java.util.Scanner;

class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Calculate the length of the string
        int length = inputString.length();

        // Print the number of characters in the string
        System.out.println("Number of characters in the string: " + length);

        scanner.close();
    }
}
