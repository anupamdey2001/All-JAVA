public class FindMin {
    public static void main(String[] args) {
        int[] arr = {10,2,1221,5351,13,5411};
        System.out.println(Min(arr));
    }
    static int Min(int[] arr){
        int small = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < small){
                 small =arr[i];
            }
        }
        return small;
    }
}
