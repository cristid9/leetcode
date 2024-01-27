// https://leetcode.com/problems/maximum-product-subarray/submissions/1158658798/
class Solution {
    public int maxProduct(int[] nums) {
        int maxSum = nums[0];
        int minSum = nums[0];
        int curMax = nums[0];

        for (int i = 1; i < nums.length; i++) {            
            int tmp = Math.max(nums[i], Math.max(curMax * nums[i], minSum *  nums[i]));
            minSum = Math.min(minSum * nums[i], Math.min(nums[i], curMax * nums[i]));
            curMax = tmp;
            maxSum = Math.max(curMax, maxSum);
        }

        return maxSum;
    }
}
