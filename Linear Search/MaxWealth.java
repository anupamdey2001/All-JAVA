public class MaxWealth {
    public static void main(String[] args) {

    }
    public int maximumWeight(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sumRow = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                  sumRow += accounts[person][account];
            }
            if(sumRow > ans){
                ans = sumRow;
            }
        }
        return ans;
    }
}
