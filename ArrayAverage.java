import java.util.Scanner;
public class ArrayAverage {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array Elements");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //avg
        int count=0;
        for(int i=0;i<n;i++){
            count+=arr[i];
        }
        System.out.print("AVG=");
        System.out.println((double)count/arr.length);
        sc.close();


    }
}
