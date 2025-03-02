class Zeros_filp_for_max_1 {
    public static int longestOnes(int[] nums, int k) {
        int l = 0, r = 0, maxlen = 0, zeros = 0;

        while (r < nums.length) {
            if (nums[r] == 0) {
                zeros++;  // Count zeros in the window
            }

            while (zeros > k) { // If zeros exceed k, shrink from left
                if (nums[l] == 0) {
                    zeros--;
                }
                l++; // Move left pointer forward
            }

            // Update max length whenever window is valid
            maxlen = Math.max(maxlen, r - l + 1);

            r++; // Expand window from right
        }
        return maxlen;
    }

    public static void main(String[] args) {
       // Solution sol = new Solution();
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0}; // Example test case
        int k = 2;
        System.out.println("Longest subarray length: " + longestOnes(nums, k));
    }
}
