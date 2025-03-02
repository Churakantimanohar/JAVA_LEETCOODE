public class RotateArray {

    static void rotate_array(int nums[], int k) {
        int n = nums.length;
        k = k % n; // Ensure k is within bounds
        int arr[] = new int[k];

        // // Store the last k elements in temp array
        // for (int i = 0; i < k; i++) {
        //     arr[i] = nums[n - k + i];
        // }

        // // Shift the remaining elements to the right
        // for (int i = n - 1; i >= k; i--) {
        //     nums[i] = nums[i - k];
        // }

        // // Copy back the k elements from temp array
        // for (int i = 0; i < k; i++) {
        //     nums[i] = arr[i];
        // } 
         for (int i = 0; i < n; i++) {
             
         }







    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};
        int k = 2; // Rotate by 2 positions
        rotate_array(nums, k);

        // Print rotated array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

