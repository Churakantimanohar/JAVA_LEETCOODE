import java.util.Arrays;

public class Kidswithgreatestcandies {

    // datatypr [] varialble = new daTATYPE[size]
        

      public static void main(String[] args) {
          int candies[] ={2,3,5,1,3};
          int extracandies = 3;
          boolean b[] = new boolean[candies.length];
          int max = candies[0];
          for(int i=0;i<candies.length;i++){
            if(candies[i]>max)
            max= candies[i];

          }
          System.out.println(max);
          for(int i =0;i<candies.length;i++){
            if(candies[i]+extracandies >= max)
            b[i]=true;
            else
            b[i]=false;

          }
          System.out.println(Arrays.toString(b));
    }
}
