import java.util.ArrayList;
import java.util.Arrays;

public class Targetarray {

    public static int[] createTargetArray(int[] nums, int[] index) {
        int ln = nums.length;
        int [] target = new int[ln];

        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i =0 ;i <ln ;i++){
            list.add(index[i], nums[i]);
        }
        for(int i =0; i <ln; i++){
            target[i] = list.get(i);

        }
        return target;

    }

    public static void main(String[] args) {
       int  nums[] = {0,1,2,3,4}; 
       int index[] = {0,1,2,2,1};
       int target [] = createTargetArray( nums,  index);
         System.out.println(Arrays.toString(target));
    }
}
