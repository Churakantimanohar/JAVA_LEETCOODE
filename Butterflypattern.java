
    public class Butterflypattern {
     
        public static void main(String[] args) {
            int n =11;  // Size of the butterfly
            for (int i = 1, j = 1; i <= 2 * n; i++, j = (i > n) ? j - 1 : j + 1) {
                // Print left stars
                System.out.print("*".repeat(j));
    
                // Print spaces in the middle
                System.out.print(" ".repeat(2 * (n - j)));
    
                // Print right stars
                System.out.println("*".repeat(j));
            }
        }
    }

