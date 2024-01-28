// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
class Solution {
    public int findMin(int[] nums) {
        if (nums.length == 1) return nums[0];
        
        int idx = runBinarySearchRecursively(nums, 0, nums.length-1);
        if (idx == -1) {
            return nums[0];
        }
        return nums[idx];
    }

    public int runBinarySearchRecursively(int[] sortedArray, int low, int high) {
        int middle = ((high + low) / 2);
            
        if (high <= low) {
            return -1;
        }
        
        if (sortedArray[middle+1] < sortedArray[middle]) {
            return middle +1;
        } else if (sortedArray[high] < sortedArray[middle]){
            return runBinarySearchRecursively(sortedArray,  middle+1, high);
        } else {
            return runBinarySearchRecursively(sortedArray,  low, middle);
        }
    }
}
