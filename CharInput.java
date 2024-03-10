import java.util.Scanner;
public class CharInput {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        //1st Method
        //char c=sc.next().charAt(0);
        //System.out.println("The character inputted was " + c);



        //Another Method 
        System.out.println("Enter a character: ");
        String input = sc.nextLine();

        // Check if input is a single character
        if(input.length() != 1) {
            System.out.println("Please enter only one character.");
            return;
        }

        char character = input.charAt(0);
        System.out.println("Character entered: " + character);



        sc.close();
    }
    
}
