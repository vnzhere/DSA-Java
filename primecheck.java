public class primecheck{
    static boolean isPrime(int n){

        if(n <= 1){
            return false;
        }

        if(n % 2 ==0){
            return false;
        }

        if(n == 2){
            return true;
        }

        for(int i=3; i<= Math.sqrt(n); i+=2){
            if(n%i== 0){
                return false;
            }
       
        }
        return true;

    }
    public static void main(String[] args) {
System.out.println("=== Prime Check ===");
System.out.println(isPrime(2));    // true
System.out.println(isPrime(13));   // true
System.out.println(isPrime(1));    // false
System.out.println(isPrime(12));   // false
System.out.println(isPrime(97));   // true
System.out.println(isPrime(100));  // false
}

}

// javac primecheck.java && java primecheck

// 204 count primes
class Solution {
    public int countPrimes(int n) {

        if(n <= 2)return 0;

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);

        isPrime[0]= false;
        isPrime[1]= false;

        for(int i =2; i*i < n; i++){
            if(isPrime[i]){
                for(int j= i*i; j<n; j+=i){
                    isPrime[j]= false;
                }
            }
        }
        int count = 0;
        for(int i=2; i<n;i++){
            if(isPrime[i]) count++;
        }
        return count;
        
    }
}

// 866 prime palindrome 
class Solution {
    public int primePalindrome(int n) {
        while (true) {
            if (isPrime(n) && isPalindrome(n)) {
                return n;
            }
            n++;
            if (n > 11 && String.valueOf(n).length() % 2 == 0) {
                n = (int) Math.pow(10, String.valueOf(n).length());
            }
        }
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    private boolean isPalindrome(int n) {
        int original = n;
        int reversed = 0;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp = temp / 10;
        }
        return reversed == original;
    }
}

// 