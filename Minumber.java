import java.util.*;

public class Minumber {

    public static void main(String[] args) {
        // Scanner obj = new Scanner(System.in);
        String word = "abcabcabc";
        System.out.println(minimumPushes(word));
    }

    public static int minimumPushes(String word) {

        // finding the frequency
        int arr[] = new int[26];// O(n)
        for (char ch : word.toCharArray()) {
            arr[ch - 'a']++; // to store from the starting of the array (index)

        } // 26 log 26
          // decresing order
        Arrays.sort(arr);
        int count = 0;
        int minKeyPress = 0;
        // rev
        // O(26)

        for (int i = 25; i >= 0; i--) {
            // int mul = 0;
            // if(count<8){
            // mul=1;
            // }else if(count<16){
            // mul=2;
            // }else if(count<24){
            // mul=3;
            // }else{
            // mul=4;
            // }
            int val = arr[i] * (count / 8 + 1);
            minKeyPress += val;
            count++;
        }
        return minKeyPress;
    }
}