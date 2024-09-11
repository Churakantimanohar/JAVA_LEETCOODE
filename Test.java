
// import java.util.*;

// public class Test {

//   public static void main(String[] args) {
//     Scanner obj  = new Scanner(System.in);
//      int n= obj.nextInt();
//      for(int i =1;i<=2*n;i++){
//       for(int j=1;j<i+1;j++){
//         if(i<=n){
//      System.out.print(i+" ");
//         }else{
         
//           for(int k=n-1;k<=1;k--){
//             for(int l=0;l<=k;l++){
//             System.out.print(i+" ");
//           }}

//         }
//       }  
//       System.out.println(" ");
//      }
     
//   }
// }


import java.util.*;

public class Test {

  public static void main(String[] args) {
    Scanner obj  = new Scanner(System.in);
    int n = obj.nextInt();
    
    // Upper part of the pattern
    for(int i = 1; i <= n; i++) {
      for(int j = 1; j <= i; j++) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
    
    // Lower part of the pattern
    for(int i = n-1; i >= 1; i--) {
      for(int j = 1; j <= i; j++) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
    
    obj.close();
  }
}
