public class Binarysearch {
    static int isasceORdesc(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // int mid = (start+end)/2;//this may exceeeds int range
            int mid = start + (end - start) / 2;
            boolean isAsc = arr[start] < arr[end];
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;

                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;

                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    static int binary(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // int mid = (start+end)/2;//this may exceeeds int range
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int arr1[]={9,7,4,2,1};
        int target = 7;
        int ans = binary(arr, target);
        int iss = isasceORdesc(arr1, target);
        System.out.println(ans+", " +iss);
    }
}
