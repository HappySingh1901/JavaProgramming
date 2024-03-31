import java.util.*;
public class until{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=100;
        int count=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            String a=sc.next();
            if(a.equals("#")){
                break;
            }
            arr[i]=Integer.parseInt(a);
            count++;

        }
        n=count;
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
        sc.close();

    }
    
}
