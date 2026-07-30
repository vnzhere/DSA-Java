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
