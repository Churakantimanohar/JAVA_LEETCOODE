public class triangle {

private static void trianglecorrect() {
    for(int i = 1;i<=5;i++){
        for(int j =1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
} 
 private static void triangledisplay(int n) {
    for(int i = 1;i<=n-1;i++){
        for(int j =1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }  
    for(int i = 0; i<=n;i++){
        System.out.print("+");
    }    

}
        
    public static void main(String[] args) {
        int n=5;
      //  trianglecorrect();
        triangledisplay(n);
        
                    }
          
            
}
