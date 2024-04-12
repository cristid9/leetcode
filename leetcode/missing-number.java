// https://leetcode.com/problems/missing-number/

class Solution {
    public int missingNumber(int[] nums) {
        int n =  nums.length;
        int idealSum = n * (n + 1) / 2;
        int sum = Arrays.stream(nums).reduce(0, (x, y) -> x + y);

        return idealSum - sum;
    }
}
