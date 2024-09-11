
import java.util.Arrays;

class Power {
    public double myPow(double x, int n) {
        double ans = 1.0 ;
          long  nn = n;
          if(nn<0) nn= -1 * nn ;
 while( nn > 0 )
    {
        if( nn%2 == 1){//odd
            ans= ans * x;
            nn = nn - 1;
        }else{
            x = x * x;//even
            nn = nn/2;
        }
     } 
      if(n<0) ans = (double)(1.0)/(double)(ans);
     return ans;
         }
         public static void main(String[] args) {
            int n=10;
            double x =2.00000;
            
            System.out.println(Arrays.toString(myPow(x,n)));
         }
}