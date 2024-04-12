// https://leetcode.com/problems/counting-bits/
class Solution {
    public int[] countBits(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;

        int  pow2 = 1;
        int delimiter = 1;
        for (int i = 1; i <= n; i++) {
            if (i == pow2) {
                dp[i] = 1;
                delimiter = pow2;
                pow2 *= 2;

            } else {
                System.out.println(i);
                System.out.println(pow2);
                dp[i] = 1 + dp[i - delimiter];
            }
        }

        return dp;
    }
}
