public class LC1780Armstrongsnumber {
    static boolean isArmstrong(int n){
        int original = n;
        int k = 0;
        int temp= n;

        while(temp>0){
            temp = temp/10;
            k++;
        }

        int sum =0;
        temp = n;
        while(temp>0){
            int digits = temp%10;
            sum = sum + (int) Math.pow(digits , k);

            temp = temp/10;
        }
        return sum == original;


    }
    public static void main(String[] args) {
    System.out.println(isArmstrong(153));  // true
    System.out.println(isArmstrong(123));  // false
    System.out.println(isArmstrong(370));  // true
    System.out.println(isArmstrong(9474)); // true
}
}

// LC 1780

class Solution {
    public boolean checkPowersOfThree(int n) {

        while(n > 0){
            if (n % 3 == 2){
                return false;
            }
            n = n/3;

        }
        return true;
        
    }
}


