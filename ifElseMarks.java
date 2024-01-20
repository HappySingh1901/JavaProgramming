import java.util.Scanner;
public class ifElseMarks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if (0 < marks && marks <= 100){

            if (91 < marks && marks <= 100){
                System.out.println("Bs kr bhai kitna padhega ");
            }else if (81 < marks && marks <= 90){
                System.out.println("Nice one ");
            }else if (71 < marks && marks <= 80){
                System.out.println("Khel gaya");
            }else if (61 < marks && marks <= 70){
                System.out.println("Cool");
            }else if (51 < marks && marks <= 60){
                System.out.println("Ek din pehle adha tha n ?");
            }else if (41 < marks && marks <= 50){
                System.out.println("Pawri ho rahi hai");
            }else if (31 < marks && marks <= 40){
                System.out.println("mauja hi mauja ");
            }else{
                System.out.println("Accha chalta hu");
            }

        }else{
            System.out.println("Enter valid marks ");
        }
        sc.close();

    }
}
