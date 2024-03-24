//Using ternary operator

import java.util.Scanner;

public class prac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();

        String[] name = new String[num];
        int[] age = new int[num];

        
        for (int i = 0; i < num; i++) {
            System.out.println("Enter name:");
            name[i] = sc.nextLine();

            System.out.println("Enter age:");
            age[i] = sc.nextInt();
            sc.nextLine();
        }

        for (int i = 0; i < num; i++) {
            System.out.println(name[i] + (age[i] >= 18 ? " is eligible to vote." : " is not eligible to vote."));
        }

        sc.close();
    }
}
