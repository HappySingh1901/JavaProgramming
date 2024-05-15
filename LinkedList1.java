import java.util.*;
public class LinkedList1 {
    public static void main(String[] args){
        LinkedList<Integer> arr1=new LinkedList<>();
        System.out.println(arr1.size());
        System.out.println(arr1.getClass());
        arr1.add(5);
        System.out.println(arr1.size());
        arr1.add(5);
        arr1.add(6);
        arr1.add(5);
        arr1.add(6);
        arr1.add(5);
        System.out.println(arr1);
        arr1.removeLast();                     //We have removeFirst as well
        arr1.removeLastOccurrence(5);          //Same we have remove first occurence as well
        System.out.println(arr1);
        arr1.remove(Integer.valueOf(5));
        System.out.println(arr1);
        System.out.println(arr1.indexOf(6));
    }
}
