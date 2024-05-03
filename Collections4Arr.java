import java.util.*;

public class Collections4Arr{
public static void main(String[] args) {
    // ArrayList<Integer> arr=new ArrayList<>();
    // Scanner sc=new Scanner(System.in);
    // try{


    //     while(sc.hasNextInt()){
    //         int a=sc.nextInt();
    //         arr.add(a);
    //     }

    //     for(int val:arr){
    //         System.out.println(val);
    //     }

    //     System.out.println(arr);
    //     System.out.println(arr.size());
    //     // System.out.println(arr.get(2));
    //     System.out.println(arr.set(2,5));                   //If i write arr.set(index(x,y)) inside the print statement it will print the value at index 2
    //     System.out.println(arr);
    //     arr.add(3,7);
    //     System.out.println(arr);
    //     ArrayList<Integer> arr2=new ArrayList<>();
    //     arr2.addAll(arr);
    //     System.out.println("arr2 = " + arr2);
    //     arr2.addAll(2,arr);
    //     System.out.println(arr2);
    //     boolean bool=arr2.containsAll(arr);
    //     System.out.println(bool);

        ArrayList<Integer> arr3=new ArrayList<>();
        ArrayList<Integer> arr4=new ArrayList<>();
        arr3.add(4);
        arr3.add(5);
        arr3.add(6);
        arr3.add(7);
        arr4.add(4);
        arr4.add(6);
        arr4.add(5);
        arr4.add(7);
        arr4.add(6);
        System.out.println("arr3"+arr3);
        System.out.println("arr4"+arr4);
        System.out.println(arr4.containsAll(arr3));     //Conatains and ConatinsAll are different

        HashSet<Integer> arr5=new HashSet<>();
        arr5.addAll(arr4);
        System.out.println("HastSet" + arr5);
        
    
    // }catch(Exception e){
    //     System.out.println("Non int val");
    // }
    }
    
}
