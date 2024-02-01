import java.util.Scanner;
public class CalcPercentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of subjects ");
        int n=sc.nextInt();
        int sum=0;
        System.out.println("Enter marks obtained in each subject out of 100");
        for(int i=0;i<n;i++){
            int marks=sc.nextInt();
            sum+=marks;
        }
        float percentage = (float) sum/n;
        System.out.println("You got "+ percentage + "%");
        sc.close();
    }
}
