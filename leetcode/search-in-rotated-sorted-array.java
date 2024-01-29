// https://leetcode.com/problems/search-in-rotated-sorted-array/description/

class Solution {
    public int search(int[] nums, int target) {
        
        
        if (nums.length == 1 && target == nums[0]) return 0;
        
        int idx = runBinarySearchRecursively(nums, 0, nums.length-1);
        if (idx == -1) {
            return runBinarySearchRecursively2(nums,target, 0, nums.length - 1);
        } 


        if (nums[idx] == target) return idx;

        int left = runBinarySearchRecursively2(nums, target, idx + 1, nums.length - 1);
        int right = runBinarySearchRecursively2(nums, target, 0, idx-1 );

        boolean leftHas = left != -1;
        boolean rightHas = right != -1;


        if (leftHas) return left;
        if (rightHas) return right;
        return -1;
    }


    public int runBinarySearchRecursively2(int[] sortedArray, int key, int low, int high) {
        int middle = ((high + low) / 2);
            
        if (high < low) {
            return -1;
        }
        
        if (sortedArray[middle] == key) {
            return middle;
        } else if (sortedArray[middle] > key){
            return runBinarySearchRecursively2(sortedArray, key, low, middle - 1);
        } else {
            return runBinarySearchRecursively2(sortedArray, key, middle + 1, high);
        }
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
