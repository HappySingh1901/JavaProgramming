import java.util.Scanner;
public class LinearSearch {    
    public static void main(String[] args) {
        int arr[]={1,4,9,4,7};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to search"); 
        int key=sc.nextInt();
        int find=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                find=1;
                System.out.println("Key found at index " + i);
                break;
            }
        }
        if (find==0){
            System.out.println("Key not found in the array");
        }
        sc.close();
    }
}
