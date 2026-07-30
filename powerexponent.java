long N = n;
if(N < 0){
    x = 1/x;
    N = -N;
}

double result = 1;

while(N > 0){
    if( N%2 == 1){
        result *= x;
    }
    x *= x;
    N = N/2;
}
return result;

// LC 50  pow(x,n)
class Solution {
    public double myPow(double x, int n) {

        long N = n;

        if(N < 0){
            x= 1/x;
            N = -N;
        }

        double result = 1;
        while(N > 0){
            if(N % 2 ==1){
                result *= x;
            }
            x *= x;
            N = N/2;
        }
        return result;
        
    }
}
//  LC 231 power of two
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n-1)) == 0;

        
    }
}

// LC 326 power of three
class Solution {
    public boolean isPowerOfThree(int n) {

        return n > 0 && 1162261467 % n == 0;
        
    }
}