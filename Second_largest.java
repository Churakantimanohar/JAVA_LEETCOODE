

public class Second_largest {


public static int Second_largest(int[] arr) {
                // TODO Auto-generated method stub
                
             int n = arr.length;
             int first_largest = Integer.MIN_VALUE;
    int second_largest = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {
        if (arr[i] > first_largest) {
            second_largest = first_largest;
            first_largest = arr[i];
        } else if (arr[i] > second_largest && arr[i] < first_largest) {
            second_largest = arr[i];
        }
    }

    if (second_largest == Integer.MIN_VALUE) {
        throw new IllegalArgumentException("No second largest element found (e.g., all elements are identical)");
    }

    return second_largest;
}
    public static void main(String[] args) {
        int arr[] = {12,35 ,1, 10, 34 ,1};
       
        System.out.println("secondlargest element" + Second_largest(arr));
            }
        
            
}
