import java.util.*;
public class Collections3Arr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        while(sc.hasNextInt()){
            arr.add(sc.nextInt());
        }
        sc.next();
        boolean bool=false;
        int a=sc.nextInt();
        for(int num:arr){
            if(num==a){
                bool=true;
            }
        }

        if(bool){
            System.out.println(arr);
            for(int i=0;i<arr.size();i++){
                if(arr.get(i)==a){
                    arr.remove(i);
                }
            }
            System.out.println(arr);
        }else{
            System.out.println(a + " not found");
        }
        sc.close();
        
    }
}
