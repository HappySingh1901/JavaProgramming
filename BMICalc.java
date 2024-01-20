import java.util.Scanner;
public class BMICalc {
    public static void main(String[] args) {
        //Body Mass Index;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your height in meters: ");
        double height=sc.nextDouble();
        System.out.print("Enter yur weight in kilograms: ");
        double weight=sc.nextDouble();
        double BMI= weight/(height*height);
        System.out.println("Your BMI is: " + BMI);

        if (BMI < 18.5){
            System.out.println("Undernourished ");
        } else if(18.5 < BMI && BMI <24.9){
            System.out.println("Normal Weight ");
        } else if(25 < BMI && BMI <29.9){
            System.out.println("Overweight");
        }else{
            System.out.println("Obese");
        }
        sc.close();
    }
}
