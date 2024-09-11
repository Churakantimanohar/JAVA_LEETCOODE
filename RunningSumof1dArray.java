import java.util.Arrays;

public class RunningSumof1dArray {
    public static int[] runningsum(int arr[]){
        int arr1[] = new int[arr.length];
        //arr1[0] = arr[0];
        for(int i = 0;i < arr.length; i++){
            if (i == 0) {//storing for first 0th index for the first
                arr1[i] = arr[i];
               continue;
            }
               arr1[i] = arr1[i-1] + arr[i];
            
        }
        return arr1;
    }
    public static void main(String[] args) {
        int arr[] ={1,1,1,1,1 };
        int arr1[] = runningsum(arr);
        System.out.println(Arrays.toString(arr1));
    }
}
