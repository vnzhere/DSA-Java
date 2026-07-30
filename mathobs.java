// LC 172 factorial trailing zeroes
class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        while( n >= 5){
            n/=5;
            count+=n;
        }
        return count;
        
    }
}

// LC 191 number of 1 bits
class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while(n!=0){
            count+= n&1;
            n >>>= 1;
        }
        return count;
        
    }
}