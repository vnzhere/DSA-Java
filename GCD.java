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

// LC 1071
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2) .equals(str2 + str1)){
            return "";
        }
        int gcdlength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdlength);
        
    }
    private int gcd(int a, int b){
        while(b!=0){
           int temp = b;
           b= a % b;
           a = temp; 
        }
        return a;
    }
}

// LC 858
class Solution {
    public int mirrorReflection(int p, int q) {
        int g = gcd(p,q);
        p = p/g;
        q = q/g;

        if(p%2 == 0) return 2;
        if(q%2 == 0) return 0;
        return 1;    
    }

    private int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

echo "alias push='git add . && git commit -m \"update\" && git push'" >> ~/.bashrc
source ~/.bashrc