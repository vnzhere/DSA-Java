public class LC 1780Armstrongsnumber{
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
            sum = sum + (int) Math.pow(digit,k);

            temp = temp/10;
        }
        return sum == original;


    }
}
