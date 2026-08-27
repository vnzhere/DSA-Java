int n = arr.length;
for (int i =0; i < n-1; i++){
    int minIndex =i;

    for (int j = i+1; j< n-1; j++){
        if(arr[j] < arr[MinIndex]){
            MinIndex =j;
        }
    }

    int temp = arr[i];
    arr[i] = arr[MinIndex];
    arr[MinIndex] = temp;
}

// LC - 414 Third distinct number
class Solution {
    public int thirdMax(int[] nums) {

        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;


        for(int num: nums){

            if (num == max1 || num == max2 || num == max3)
            continue;

            if(num > max1){
                max3 = max2;
                max2 = max1;
                max1 = num;
            }

            else if(num > max2){
                max3 = max2;
                max2 = num;
            }

            else if(num> max3){
                max3 = num;
            }
        }

        return max3 == Long.MIN_VALUE ? (int) max1 : (int) max3;
        
        
    }
}