public class Operators {
    public static void main(String[] args) {
        int num1=5;
        num1+=5;
        System.out.println(num1);                   //10
        int num2=10;
        System.out.println(num1%num2);              //0   //Modulus Operator. 

        num1++;
        System.out.println(num1);                   //11
        //num2++;
        int y=num1++;
        System.out.println(y);                      //11
        y=++num1;
        System.out.println(y);                      //13
        System.out.println(num1);                   //13

        int num3=17;

        int z=num3--;
        System.out.println(z);
        --num3;
        System.out.println(num3);


    }
}
