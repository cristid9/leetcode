// https://leetcode.com/problems/container-with-most-water/submissions/1201996971/

class Solution {
    public int maxArea(int[] height) {
        

        int left = 0;
        int right = height.length - 1;
        int max = -1;

        while(left < height.length  && right >= 0) {
            max = Math.max(max, Math.min(height[left], height[right]) * Math.abs(right - left));

            if (height[right] > height[left]) {
                left++;
            } else {
                right--;
            }
        
        }


        return max;

    }
}
