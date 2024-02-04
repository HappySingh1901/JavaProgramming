public class strings {
    public static void main(String[] args){
        String car="Volvo";
        System.out.println(car); 

        String txt="qwertyuiopasdfghjklzxcvbnm";
        System.out.println(txt.length());

        String name="Happy signh";
        System.out.println(name.toUpperCase());

        String name1="Happy signh";
        System.out.println(name1.toLowerCase());

        String common= "ABCDEFGHIJKLMNPQRSTUVWXYZ";

        System.out.println(common.indexOf("J"));
        System.out.println(common.charAt(5));

        String str1="Happy";
        String str2=" Singh";

        System.out.println(str1.concat(str2));              //We can simply add though
        System.out.println(str1+str2);

        int num1=100;
        String str3=" Hundred";                             //If we add a number to string the resultant will be a string.
        System.out.println(num1+str3);

        int num2=3;
        String str4="Hello";
        System.out.println(str4.repeat(num2));
    }
}
