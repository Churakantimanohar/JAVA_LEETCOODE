//TO PRINT NUMBERS FROM 1 - 100 WITHOUT USING LOOPS


public class Printnum {
    public static void printnumbers(int n){
        if(n > 100){
            return;
        }
        System.out.println(n);
        printnumbers(n+1);
    }


    public static void main(String[] args) {
        printnumbers(1);
    }
}
