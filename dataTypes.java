public class dataTypes {
    public static void main(String[] main){
        
        int a=5;
        int b=6;
        System.out.println(a*b);
        
        // byte c=129;                          //Error due to byte size is from -128 to 127 or 1 byte.
        // System.out.print(c);
        
        byte d=127;
        System.out.println(d);

        short e=20000;                          //Short stores whole number from -32,768 to 32,767 r 2 bytes.
        System.out.println(e);
        
        long f=20000000;
        System.out.println(f);                  //8 bytes size.

        String text="Hello";                    
        System.out.println(text);               //Char take 2 bytes.
        System.out.println(text.getClass());    //We can use getClass() to get the datatype.

        boolean myBool=true;
        System.out.println(myBool);

        float num3=10.8794f;
        System.out.println(num3);

        double num4 = 20.78367;                 //We can also write 20.78367d.
        System.out.println(num4);
        
    }
}
