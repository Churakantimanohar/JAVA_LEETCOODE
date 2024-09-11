import java.util.Arrays;

public class Concatenation {
    public static int[] concatenationofarray(int arr[]){
        int arr1[] = new int[2 * arr.length];
        for(int i = 0; i < arr.length; i++){
          arr1[i] = arr[i];
          arr1[i + arr.length] = arr[i];
        }
        // for(int i = 0; i < arr.length; i++){
        //     arr1[i + arr.length] = arr[i];
        //   }
        return arr1;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,3,4,2};
        int arr1[] = concatenationofarray(arr);
        System.out.println(Arrays.toString(arr1));
    }
}
