public class Linear {
    public static void main(String[] args) {
         int[] arr = {1,2,3,4,54,454,2,23,4324,445,2,2,1,534,5453,4,11,124321,3,485,42241,3,5,44};
         int ans = linear(arr, 2);
        System.out.println(ans);
    }
    static int linear(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int elements = arr[index];
            if (elements == target){
                return index;
            }
        }
        return -1;
    }
}
