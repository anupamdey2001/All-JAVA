public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] arr = {'a','c','x'};
        char target = 'b';
        System.out.println(smallestLetter(arr,target));
    }
    static char smallestLetter(char[] arr, char target){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end = mid -1;
            } else {
                start = mid+1;
            }
        }
        return arr[start%arr.length];
    }
}
