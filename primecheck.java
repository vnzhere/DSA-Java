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