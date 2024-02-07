public class math {
    public static void main(String[] args){
        
        System.out.println(Math.max(4749,7982));               //It takes only two arguments.
        
        System.out.println(Math.min(47832,47839));

        System.out.println( (int) Math.sqrt(4));                //(int) for intrger value otherwise the value would be in float.

        System.out.println( (int) Math.cbrt(8));

        System.out.println(Math.abs(-1.4223));

        System.out.println((int)Math.pow(6,3));
        
        System.out.println(Math.ceil(-1.4223));

        System.out.println(Math.floor(-1.4223));

        System.out.println(Math.random());          //Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive)

        System.out.println((int)(Math.random()*101)); //This will give Output frm 0-100.

        System.out.println(Math.sin(1));

        System.out.println(Math.cos(1));
    }
}