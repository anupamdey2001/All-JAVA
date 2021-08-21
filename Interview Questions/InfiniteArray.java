public class InfiniteArray {
    public static void main(String[] args) {
        int[] anArray = {
                100, 200, 300,
                400, 500, 600,
                700, 800, 900,
                1000, 1100, 1200,
                1300, 1400, 1500,
                1600, 1700, 1800,
                1900, 2000, 2100
        };
        int target = 800;
        System.out.println(ans(anArray,target));
    }
    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;
       while ( target > arr[end] ){
         int  newStart = end +1;
         end = end + (end- start + 1) * 2;
         start = newStart;
       }
       return infinite(arr,target,start,end);
    }
    static int infinite(int[] arr, int target, int start, int end){
        while( start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
