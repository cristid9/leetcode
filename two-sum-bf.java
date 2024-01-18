// https://leetcode.com/problems/two-sum/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0, j = 0;
        outerloop:
        for (i = 0; i < nums.length; i++) {
            for (j = 0; j < nums.length; j++) {
                if (i == j) continue;

                if (nums[i] + nums[j] == target) {
                    break outerloop;
                }
            }
        }
        return new int[]{i, j};
    }
}
