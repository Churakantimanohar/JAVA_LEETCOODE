public class PowerOfTwo {

    // Method 1: Using loop and Math.pow()
    public boolean isPowerOfTwoUsingLoop(int n) {
        for (int i = 0; i < 31; i++) {
            int ans = (int) Math.pow(2, i);
            if (ans == n) {
                return true;
            }
        }
        return false;
    }

    // Method 2: Using bitwise operation (n & (n - 1)) == 0
    public boolean isPowerOfTwoUsingBitwise(int n) {
        return (n > 0) && ((n & (n - 1)) == 0);
    }

    // Method 3: Using division
    public boolean isPowerOfTwoUsingDivision(int n) {
        if (n <= 0) return false;
        while (n > 1) {
            if (n % 2 != 0) return false;
            n /= 2;
        }
        return true;
    }

    // Method 4: Using logarithms
    public boolean isPowerOfTwoUsingLogarithm(int n) {
        if (n <= 0) return false;
        double logBase2 = Math.log(n) / Math.log(2);
        return Math.floor(logBase2) == Math.ceil(logBase2);
    }

    // Method 5: Recursive approach
    public boolean isPowerOfTwoRecursive(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;
        return (n % 2 == 0) && isPowerOfTwoRecursive(n / 2);
    }
    
    // Main function to test the different methods
    public static void main(String[] args) {
        PowerOfTwo powerOfTwo = new PowerOfTwo();
        
        int testNumber = 16;
        
        System.out.println("Using Loop: " + powerOfTwo.isPowerOfTwoUsingLoop(testNumber));
        System.out.println("Using Bitwise: " + powerOfTwo.isPowerOfTwoUsingBitwise(testNumber));
        System.out.println("Using Division: " + powerOfTwo.isPowerOfTwoUsingDivision(testNumber));
        System.out.println("Using Logarithm: " + powerOfTwo.isPowerOfTwoUsingLogarithm(testNumber));
        System.out.println("Using Recursion: " + powerOfTwo.isPowerOfTwoRecursive(testNumber));
    }
}
