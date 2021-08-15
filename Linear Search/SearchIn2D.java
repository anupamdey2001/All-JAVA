import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},{4,5},{6,7,8,9},{18,12,15,53,88}
        };
        System.out.println(Arrays.toString(search2D(arr,88)));
    }
    static int[] search2D(int[][] arr, int target){
        if (arr.length == 0){
            return new int[] {-1,-1};
        }
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0;column < arr[row].length; column++){
                if (arr[row][column] == target){
                    return new int[] {row,column};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
