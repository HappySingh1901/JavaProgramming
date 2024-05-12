import java.util.Scanner;
public class ConversionOfEvery {
    public static void main(String[] args){
        //String to char Array
        String s="Happy Singh";
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //String to String Array
        String s4="Hello How are you !";
        String[] arr2=s4.split(" ");
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
        
        System.out.println();               
        //Integer to String
        int a=123;
        String s1=String.valueOf(a);
        //or
        String s2=Integer.toString(a);
        System.out.println(s1+"       "+ s2);



        String s5="Hello how are you";
        System.out.println("remove all spaces : " + s5.replaceAll(" ", ""));


        // int []arr1={1,2,3,4,5};
        // System.out.println(arr1.toString());




    }
}
