

public class FirstandLast {
    static int occurance(int arr[], int target )
{
        int low = 0; int high = arr.length-1;
        int ans = -1;
        //lower index
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid]== target){
                ans=mid;
                high = mid -1;
            }else if(arr[mid] <= target){
                low= mid+1;
            }else {
                high = mid-1;
            }

        
        }return ans;
} 
static int Lasroccurance(int arr[], int target )
{
        int low = 0; int high = arr.length-1;
        int ans = -1;
        //lower index
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid]== target){
                ans=mid;
                low= mid+1;
            }else if(arr[mid] <= target){
                low= mid+1;
            }else {
                high= mid-1;
            }

        
        }return ans;
} 


public static void main(String[] args) {
    int arr[]=  {3,4,13,13,13,20,40};
    int target= 13;
    int res = occurance(arr, target);
    int res1 = Lasroccurance(arr, target);
    System.out.println(res+" "+res1);
}
}
