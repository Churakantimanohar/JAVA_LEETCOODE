import java.util.Arrays;

public class shuffletheArray {
     public static int[] shuffle(int[] nums, int n) {
        int arr[] = new int[nums.length];
        int j = 0;  // Index for the new array

        for (int i = 0; i < n; i++) {
            arr[j++] = nums[i];       // Add element from the first half
            arr[j++] = nums[i + n];   // Add corresponding element from the second half
        }

        return arr;
    }
    
    public static void main(String[] args) {
       // Solution sol = new Solution();
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] result = shuffle(nums, n);
        System.out.println(Arrays.toString(result));  // Output should be [2, 3, 5, 4, 1, 7]
    }


}
