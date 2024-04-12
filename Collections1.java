import java.util.*;
public class Collections1 {
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(3,4);
        System.out.println(arr + " "+ arr.size());

        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
        //Or we can make an iterator
        System.out.println("Another way using iterartor");
        Iterator<Integer> iter=arr.iterator();
        while(iter.hasNext())
        System.out.println(iter.next());
    }
}
