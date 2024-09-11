import java.util.Arrays;

public class WealthyCustomers {
    public static int maximumWealth(int[][] accounts) {
        // int largest = accounts[0][0];
        // for(int i[] : accounts){
        // int current = 0;
        // for(int j : i) current += j;
        // largest = Math.max(largest,current);
        // }
        // return largest;
        int i, j;
        int max = 0;
        int[] sum = new int[accounts.length];
        for (i = 0; i < accounts.length; i++) {
            for (j = 0; j < accounts[i].length; j++) {
                sum[i] += accounts[i][j];

            }
            max = Arrays.stream(sum).max().getAsInt();
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 1, 2, 3 } };

        int largest = maximumWealth(arr);
        System.out.println(largest);
    }
}
