// https://leetcode.com/problems/number-of-1-bits
class Solution {
    public int hammingWeight(int n) {
        int mask = 1 ;
        int count = 0;
        while (n != 0) {
            int digit = n & mask;
            if (digit == 1) count++;
            n = n >> 1;
        }
        return count;
    }
}
