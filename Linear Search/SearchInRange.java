import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,3,4,54,454,555,23,4324,445};
        int ans = linearRange(arr, 2);
        System.out.println(ans);
    }

    private static int linearRange(int[] arr, int target) {
        if(arr.length == 0){
            return -1;
        }
        for (int i = 1; i < 4; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

}
