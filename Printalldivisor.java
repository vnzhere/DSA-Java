public class Printalldivisor{
    static void printDivisors(int n){

        System.out.println("divisors of" + n + ": ");
        for(int i = 1; i*i<= n; i++){
            if(n%i == 0){
                System.out.print(i + " ");

                if(i!= n/i){
                    System.out.print(n/i + " ");
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
    System.out.println("=== Print Divisors ===");
    printDivisors(36);   // 1 36 2 18 3 12 4 9 6
    printDivisors(12);   // 1 12 2 6 3 
    printDivisors(1);    // 1
    printDivisors(7);    // 1 7
    printDivisors(100);  // 1 100 2 50 4 25 5 20 10
    }
}

// LC 1952 three divisors
class Solution {
    public boolean isThree(int n) {

        int count = 0;

        for(int i =1; i*i<=n; i++){
            if(n%i == 0){
                count++;

                if(i!=n/i){
                    count++;
                }
            }
        } 
         return count == 3;         
    }
}