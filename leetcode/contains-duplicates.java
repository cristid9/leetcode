// https://leetcode.com/problems/contains-duplicate/
class Solution {
    public boolean containsDuplicate(int[] nums) {

        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (mp.containsKey(nums[i])) {
                mp.put(nums[i], mp.get(nums[i]) + 1);
                return true;
            } else {
                mp.put(nums[i], 1);
            }
        }

        return false;
    }
}
