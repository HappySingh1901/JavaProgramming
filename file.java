import java.util.*;
import java.io.*;
public class file {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        File myfile=new File("Abhi.txt");
        try{
            if(myfile.createNewFile()){
                System.out.println("Created");
            }else{
                System.out.println("Exists");
            }
        }catch(IOException e){
            System.out.println("File not created");
        }
        // try{
        //     FileWriter fileWriter=new FileWriter("Abhi.txt");
        //     fileWriter.write("This is first file create by abhi");
        //     fileWriter.close();
        // }catch(IOException e){
        //     System.out.println("Cant write in file");
        // }
        // sc.close();
    }
}
