// count and extract digits code 
public class Basicmaths{
    static int countDigits(int n){
        // static can be called even without creating any object

        int count = 0; 
        // count starts at 0 and then adds the values as per loop 

        if (n==0) return 1;
        // edge case 1: when n==0, prints 0 and stop 

        n = Math.abs(n);
        // handles negatives

        while(n>0){
            // loop runs till the value becomes 0
            n = n/10;
            // chop last digit
            // 7658--765--76--7--0
            count++;
        }
        return count;
        // exits the method early 
    }

   
    static void extractDigits(int n){
        // edge case: return 0 and stop

        if (n == 0) {
            System.out.println(0);
            return;
        }
        n = Math.abs(n);
        System.out.print("Digits: ");
        
        while(n > 0){
            int digit = n%10;
            // 1234%10=4, 123%10=3, 12%10=2, 1%10=1
             System.out.print(digit+ " ");
            //  removes last digit 
            // 1234--123--12--1--0
             n= n/10;
        
        }
    }
        
        public static void main(String[]args){
            System.out.println("=== Count Digits ===");
             System.out.println(countDigits(7894));
              System.out.println(countDigits(0));
               System.out.println(countDigits(-123));

                 System.out.println("=== Extract Digits ===");
                 extractDigits(1234);
                 extractDigits(0);
                 extractDigits(-456);
        }

    }
    