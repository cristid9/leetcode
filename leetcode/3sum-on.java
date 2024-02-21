// https://leetcode.com/problems/3sum/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {



        Set<List<Integer>> ss = new HashSet<>();

        Arrays.sort(nums);


        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    ss.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    right--;
                    left++;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }

        }

        return new ArrayList<>(ss);
    }
}
