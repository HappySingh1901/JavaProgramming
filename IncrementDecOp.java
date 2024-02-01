public class IncrementDecOp {
    public static void main(String[] args) {
        int x=8;
        int z=x++;                  //Remember int z=x++ and only x++ wil work different.
        System.out.println(z);
        int y=++x;
        System.out.println(y);

        //It Works with characters as well
        char a='a';
        a++;
        System.out.println(a);      //The answer is b
    }
}
