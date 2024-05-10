import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
public class FileHandling1 {
    public static void main(String[] args){
        File x=new File("filename.txt");
        // try{
        //     if(x.createNewFile()){
        //         System.out.println(x.getName());
        //     }else{
        //         System.out.println("File alredy exist");
        //     }
        // }catch(IOException e){
        //     System.out.println("Error");
        // }


        // We can directly create a file with filewriter n need of creating an emptyfile using createfile.


        // try{
        //     FileWriter x1=new FileWriter("filename.txt");            //FileWriter x1=new FileWriter("filename.txt",true);  //to append.
        //     x1.write("this is my first file");
        //     x1.close();

        // }catch(IOException e){
        //     System.out.println("Error content not written");

        // }

        try{
            Scanner sc=new Scanner(x);
            while(sc.hasNextLine()){
                String s=sc.nextLine();
                System.out.println(s);
            }
            sc.close();
        }catch(FileNotFoundException e){
            System.out.println("Eroor");
        }

        //to count character in file
        int len=0;
        try{
            Scanner sc=new Scanner(x);
            while(sc.hasNextLine()){
                String s=sc.nextLine();
                len=s.length()+len;
                
            }
            System.out.println(len);
        }catch(FileNotFoundException e){
            System.out.println("Error");
        }

        //to count words
        int count=0;
        try{
            Scanner sc=new Scanner(x);
            while(sc.hasNext()){
                String s1=sc.next();
                count++;
                
            }
            System.out.println(count);
        }catch(FileNotFoundException e){
            System.out.println("Error");
        }

    }
}
