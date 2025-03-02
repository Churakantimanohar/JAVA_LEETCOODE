/**
 * arr
 */
import java.util.*;
public class arr {
    
public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    int arr[]=new int[n];
    
    for(int i=0;i< n;i++){
      arr[i]=obj.nextInt();

    }
int h=0;
 for(int j=0;j<n;j++){
  h += arr[j];
}
 System.out.println(h);
    

    //display the array elements
    for(int i=0;i<n;i++){
      System.out.println(arr[i]);
    }
    

    obj.close();
}
}