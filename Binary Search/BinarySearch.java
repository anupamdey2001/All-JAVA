public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,8,9,55,66,77,88,99};
        System.out.println(binarySearch(arr, 88));
    }
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

while (start <= end){
    int middle = start + (end-start) / 2;
            if (target > arr[middle]) {
                start = middle + 1;
            } else if (target < arr[middle]) {
                end = middle - 1;
            } else {
                return middle;
            }

        }
        return -1;
    }
}
