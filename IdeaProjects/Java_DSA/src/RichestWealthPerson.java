public class RichestWealthPerson {
    public static void main(String[] args) {
        int [][] arr = {
                {1, 2, 3},
                {1, 2, 3}
        };
        int ans = maximumWealth(arr);
        System.out.println(ans);
    }
    static int maximumWealth(int[][] accounts){
        // person = row;
        // account = col;
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for (int person = 0; person < accounts.length; person++) {
            // When you start a new column , take a new sum.
            for (int account = 0; account < accounts.length; account++) {
                sum += accounts[person][account];
            }
            // Now we have sum of accounts of person.
            // Check with overall ans.
            if (sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
