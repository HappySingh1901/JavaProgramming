// 0-> rock : 1-> paper : 2-> Scissor
import java.util.*;
public class rockPaper {
    public static void main(String[] args) {
        // Variable Declaration
/* Here 1 stands for ROck
and 2 stands for Paper
and 3 stands for Seissor
 */
        System.out.println("Hello sir, Welcome to our rock , paper , seissor game\n" + "Enter 1 for Rock\n" + "Enter 2 for Paper\n" + "Enter 3 for seissor");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        Random var = new Random();
        int computerInput = var.nextInt(1, 3);
        switch (userInput) {
            case 1 -> System.out.println("You choose Rock");
            case 2 -> System.out.println("You choose paper");
            case 3 -> System.out.println("You choose seissor");
            default -> System.out.println("please select valid input");
        }

        if (userInput<=3){
        switch (computerInput) {

            case 1 -> System.out.println("Computer choose Rock");
            case 2 -> System.out.println("Computer choose paper");
            case 3 -> System.out.println("Computer choose seissor");

        }

        }
        else {
            System.out.println("");
        }
// Winner Declaration
        if (userInput == 1 && computerInput == 2) {
            System.out.println("Computer won!");
        } else if (userInput == 2 && computerInput == 3) {
            System.out.println("Computer won!");
        } else if (userInput == 3 && computerInput == 1) {
            System.out.println("Computer won!");
        } else if (userInput>3) {
            System.out.println("It is an invalid input game cant be proceed furthur");

        } else {
            System.out.println("Congrats! you won the match");

        }
        sc.close();
    }
}

