public class findMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,9};
        int target = 7;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr, int target){
        int firstTry = orderSearch(arr, target, 0, peakIndexInMountainArray(arr));
        if(firstTry != -1){
            return firstTry;
        }
        return orderSearch(arr, target, peakIndexInMountainArray(arr)+1, arr.length-1);
    }
    static int orderSearch(int[] arr, int target, int start, int end){
        boolean isAsc = arr[start] < arr[end];
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start < end)
        {
            int mid  = start + (end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                end = mid;
            }
            else
            {
                start =mid+1;
            }
        }
        return start;
    }
}
