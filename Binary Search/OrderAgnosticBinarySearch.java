public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,9,12,14,20,33};
        int target = 20;
        System.out.println(OrderAgnostic(arr,target));
    }
    static int OrderAgnostic(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        if(arr[end] > arr[start]){
            while(start <= end){
                int mid = start + (end-start)/2;
                if(target > arr[mid]){
                    start = mid +1;
                }else if (target < arr[mid]) {
                    end = mid -1;
                }else {
                    return mid+1;
                }
            }
        }
        else{
            while(start <= end){
                int mid = start + (end-start)/2;
                if(target > arr[mid]){
                    end = mid -1;
                }else if (target < arr[mid]) {
                    start = mid +1;
                }else {
                    return mid+1;
                }
            }
        }
        return -1;
    }
}
