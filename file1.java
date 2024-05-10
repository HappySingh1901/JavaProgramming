import java.util.*;
import java.io.*;
public class file1 {
    public static void main(String[] args){
        File s=new File("xyz1111.txt");
        Scanner sa=new Scanner(System.in);
        try{
            FileWriter x=new FileWriter("xyz1111.txt",true);
            x.write(" \nThis is my file 1");
            String s3=sa.nextLine();
            x.write(s3);
            x.close();
        }catch(IOException e){
            System.out.println("file not found");
        }
        try{
            Scanner sc=new Scanner(s);
            while(sc.hasNextLine()){
                String s1=sc.nextLine();
                System.out.println(s1);
            }
        }catch(IOException e){
            System.out.println("File not found");
        }

    }
}
