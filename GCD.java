// Iterative

while(b!=0){
    int temp = b;
    b = a% b;
    a = temp;
}

// Recursive
if(b ==0) return a;
return gcd (b , a% b);

// LC 1979
class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for(int num:nums){
            if(num<min) min=num;
            if(num>max) max=num;
        }
        return GCD(min,max);
        
    }
    private int GCD(int a, int b){
        while(b!= 0){
            int temp =b;
            b = a%b;
            a= temp;
        }
        return a;
    }
}