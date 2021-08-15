public class EvenDigits {
    public static void main(String[] args) {
int[] arr = {12,2,3,66,1475,6666};
        System.out.println(findNumbers(arr));
    }
    static int findNumbers(int[] nums){
         int count = 0;
        for (int num : nums) {
            if(evenDigit(num)){
               count++;
            }
        }
         return count;
    }
    static boolean evenDigit(int num){
        int count = 0;
        while (num>0){
            count++;
            num = num/10;
        }
        return count % 2 == 0;
    }
}
