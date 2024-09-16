
public class Armstongnumber {
  

public static void main(String[] args) {
    int value = 153;
   // System.out.println(isarmstrong(value));
   System.out.println("no of digits"+digitsnumber(value));
   if(isarmstrong(value)){
    System.out.println("it is a Armstrongnumber");
   }else{
    System.out.println("it is  not a Armstrongnumber");
   }
}

public static boolean isarmstrong(int input){
    int  temp = input;
    int  digits = 0;
    int  sum = 0;
    int digitscount = digitsnumber(input);

    while( temp  > 0 ){
        digits = temp % 10;
        temp = temp / 10;
        sum = sum + (int) Math.pow(digits, digitscount);//this code workd for the n numbers;
    }

    return sum == input;
}
public static int  digitsnumber(int input) {
    int cnt = 0;
    while(input > 0){
        input = input /10;
        cnt ++;
    }
    return cnt;
}
}
