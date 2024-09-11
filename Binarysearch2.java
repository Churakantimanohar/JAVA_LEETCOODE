public class Binarysearch2 {
    
         static public int search(int[] nums, int target) {
    //         int tar=-1;
    //         for(int i=0;i<nums.length;i++){
    //             if(nums[i]==target)
                
                   
    //             tar =i;
    //         }
    // return tar;
    int start = 0;
    int end = nums.length-1;
    while(start<= end){
     int mid = start+(end - start)/2;
     if(nums[mid] == target){
        return mid;
     }
     if(nums[mid]<target ){
      start= mid+1;
        
     }else{
        end=mid-1;
     }
    }
    return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,5,6,7,9,10,11,12,13,14,15};
        int target=14;
       int y= search(arr,target);
        System.out.println(y);
    }
    }
