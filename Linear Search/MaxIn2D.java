public class MaxIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},{4,5},{666,7,8,9},{18,12,15,53,88}
        };
        System.out.println(max2D(arr));
    }
    static int max2D(int[][] arr){
int max = Integer.MIN_VALUE;
//        for (int row = 0; row < arr.length; row++) {
//            for (int column = 0;column < arr[row].length; column++){
//                if (arr[row][column] > max){
//                    max = arr[row][column];
//                }
//            }
//        }
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }
}
