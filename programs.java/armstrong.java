public class armstrong {
    static String armstrongf(int n){
        int sum=0;
        int temp=n;//153=1^3+5^3+3^3
        while(n>0){
            int remainder=remainder %10;
            sum=sum+remainder;
            temp=temp/10;

        }
        if(temp==sum){
            return "yes";

        }else{
            return "no";
        }
    }
    public static void main(String[] args) {
        armstrongf( );
    }
}
