// LC 912 : same as also
class Solution {
    public int[] sortArray(int[] nums) {
        mergesort(nums, 0, nums.length-1);
        return nums;    
    }