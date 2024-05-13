import java.util.*;
import java.io.*;
public class fileprac {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        File f=new File(s);
        try{
            FileWriter x=new FileWriter(s);
            x.write("Hello world");
            x.close();

        }catch(IOException e){
            System.out.println("File not fount.");
        }
        try{
            Scanner sa=new Scanner(f);
            while(sa.hasNext()){
                System.out.println(sa.next());
            }
        }catch(IOException e){
            System.out.println("File not found");

        }
    }
}
