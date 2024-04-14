import java.util.*;
public class Collections2Arr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        while(sc.hasNextInt()){
            arr.add(sc.nextInt());
        }
        sc.next();

        int a=sc.nextInt();
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        for(int num:arr){
            if(num<a){
                arr1.add(num);
            }else{
                arr2.add(num);
            }
        }
        System.out.println(arr);
        System.out.println(arr1);
        System.out.println(arr2);
        sc.close();
    }
}
