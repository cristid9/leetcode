// https://leetcode.com/problems/product-of-array-except-self/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] sumLeft = new int[nums.length];
        int[] sumRight = new int[nums.length];
        sumLeft[0] = nums[0];
        sumRight[nums.length-1] = nums[nums.length - 1];

        for (int i = 1, j = nums.length - 2; i < nums.length && j > 0; i++, j--) {
            sumLeft[i] = sumLeft[i - 1] * nums[i];
            sumRight[j] = sumRight[j + 1] * nums[j];
        }

        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            answer[i] = 1;

            if (i -1 >= 0) {
                answer[i] *= sumLeft[i - 1];
            }

            if (i + 1 < nums.length) {
                answer[i] *= sumRight[i + 1];
            }

        }
        return answer;
    }
}
