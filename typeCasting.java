public class typeCasting {
    public static void main(String[] args){
        int num1=10;                              //Widening casting(autmatically) - smaller to larger type size.
        double num2=num1;
        System.out.println(num2);


        //double num3= 10.0;                       //This can't be implemented you cannot convert larger to smaller type size.
        //int num4= num3;

        double num3 = 10.0;
        int num4= (int) num3;
        System.out.println(num4);

    }
}
