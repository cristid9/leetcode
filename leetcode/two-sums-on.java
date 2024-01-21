// O(N)
// https://leetcode.com/problems/two-sum/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            mp.put(nums[i], i);
        }

        int i = 0, j = 0;
        for (; i < nums.length; i++) {
            int dif = target - nums[i];
            if (mp.containsKey(dif)) {
                j = mp.get(dif);
                if (j != i) break;
            }
        }

        return new int[]{i, j};
    }
}
