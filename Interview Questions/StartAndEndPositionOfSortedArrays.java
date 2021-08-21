import java.util.Arrays;

public class StartAndEndPositionOfSortedArrays {
    public static void main(String[] args) {
       int[] nums = {5,7,7,7,7,8,8,10};
       int target = 7;
        System.out.println(Arrays.toString(positions(nums,target)));
    }
    static int[] positions(int[] arr, int target){
        int[] ans  = {-1,-1};
        int start = search(arr,target,true);
            int end = search(arr, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    static int search (int[] arr, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //potential answer will be found
                ans = mid;
                if(findStartIndex){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
