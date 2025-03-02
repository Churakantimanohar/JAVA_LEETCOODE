public class Perfect {

    // Function to check if a number is a perfect number
    public static void perfect(int n) {
        int sum = 0;
        System.out.print("Factors of " + n + " are: ");
        
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("\nSum of factors: " + sum);

        if (n == sum) {
            System.out.println(n + " is a Perfect Number.");
        } else {
            System.out.println(n + " is NOT a Perfect Number.");
        }
    }

    // Function to count numbers between n and m
    public static int number(int n, int m) {
        //n- m 1-10-> 1,2,3,4,5,6,7,8,9,10 total digits are 11
    int s =0;
    int d =0;
    for(int i=n;i<10;i++){
      s++;
    }
    for(int i=10;i<m;i++){
        d++;
      }
    
    return s+d*2;

    }

    public static void main(String[] args) {
        int n = 28; // Change this to any number to check
        int m = 13;
        
        perfect(n); // Checking if n is a perfect number

        int count = number(n, m);
        System.out.println("Total numbers between " + n + " and " + m + " (inclusive): " + count);
    }
}

