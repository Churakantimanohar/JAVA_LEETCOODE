public class CountDigits {

    public static int countdigits(int input) {
        int cnt = 0;
        while(input > 0){
            input = input / 10;
            cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        int input = 153;
        System.out.println(countdigits(input));
    }
}
