// LC 912 : same as also
class Solution {
    public int[] sortArray(int[] nums) {
        mergesort(nums, 0, nums.length-1);
        return nums;    
    }
      static void mergesort(int arr[], int left, int right){
            if(left >= right){
            return;
        }  
        int mid = (left+right)/2;
        mergesort(arr, left, mid);
        mergesort(arr, mid+1, right);
        merge(arr, left, mid, right);
        
    }