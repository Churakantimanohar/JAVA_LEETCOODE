public class Factors {
    public static void main(String[] args) {
        int n=12;
        int j=0;
        for (int i = 1; i <= n; i++) {
            if(n%i==0 && i<=n){
                //System.out.print(i+" ");
                j=j+i;
            }


            
        }
        System.out.println(j);
    }


}
    

