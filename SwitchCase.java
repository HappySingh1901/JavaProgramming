import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character from A-Z in Capital Letters");
        String str = sc.next();
        switch (str){
            case "A":
                System.out.println("Apple");
                break;
            case "B":
                System.out.println("Ball");
                break;
            case "C":
                System.out.println("Cat");
                break;
            case "D":
                System.out.println("Dog");
                break;
            case "E":
                System.out.println("Elephant");
                break;
            case "F":
                System.out.println("Fish");
                break;
            case "G":
                System.out.println("Grapes");
                break;
            case "H":
                System.out.println("Hen");
                break;
            case "I":
                System.out.println("Ice-Cream");
                break;
            case "J":
                System.out.println("Jug");
                break;
            case "K":
                System.out.println("Kite");
                break;
            case "L":
                System.out.println("Loin");
                break;
            case "M":
                System.out.println("Mango");
                break;
            case "N":
                System.out.println("Nest");
                break;
            case "O":
                System.out.println("Orange");
                break;
            case "P":
                System.out.println("Peacock");
                break;
            case "Q":
                System.out.println("Queen");
                break;
            case "R":
                System.out.println("Rabbit");
                break;
            case "S":
                System.out.println("Ship");
                break;
            case "T":
                System.out.println("Tiger");
                break;
            case "U":
                System.out.println("umbrella");
                break;
            case "V":
                System.out.println("Van");
                break;
            case "W":
                System.out.println("Watch");
                break;
            case "X":
                System.out.println("Xylophone");
                break;
            case "Y":
                System.out.println("Yak");
                break;
            case "Z":
                System.out.println("Zebra");
                break;
            default:
                System.out.println("Write in Upper case or form A-Z only");

            sc.close();
        }
    }
}
