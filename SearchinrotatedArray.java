
public class SearchinrotatedArray {

   public static void main(String[] args) {
    int arr[] = {4,5,6,7,0,1,2};
    int k=0;
    int s=search(arr,k);
    System.out.println(s);
   }
   static  int search(int[] arr, int k) {
        int n = arr.length;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2; // if mid points to the target
            if (arr[mid] == k)
                return mid;
            // if left part is sorted
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= k && k <= arr[mid]) {
                    // element exists
                    high = mid - 1;
                } else {
                    // element does not exist
                    low = mid + 1;
                }
            } else { // if right part is sorted
                if (arr[mid] <= k && k <= arr[high]) {
                    // element exists
                    low = mid + 1;
                } else {
                    // element does not exist
                    high = mid - 1;
                }
            }
        }
        return -1;
    
    }
}
