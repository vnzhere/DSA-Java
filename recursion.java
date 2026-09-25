//  P-1: simple recursion with return value 
static long factorial (int n){
    if( n <= 1) return 1;

    return n * factorial(n-1);
}


// p-2 multiple recursion calls
static int fibonacci(int n){
    if (n == 0) return 0;
    if (n == 1) return 1;

    return fibonacci(n-1)+ fibonacci(n-2);
}

Arrays.sort(nums);

for (int i = 0; i < nums.length - 2; i++) {
    int left = i + 1;
    int right = nums.length - 1;

    while (left < right) {
        int sum = nums[i] + nums[left] + nums[right];

        if (sum == 0) {
            // found triplet
        } else if (sum < 0) {
            left++;
        } else {
            right--;
        }
    }
}






echo "alias push='git add . && git commit -m \"Initial Commit\" && git push'" >> ~/.bashrc
source ~/.bashrcecho "alias push='git add . && git commit -m \"Initial Commit\" && git push'" >> ~/.bashrc
source ~/.bashrcecho "alias push='git add . && git commit -m \"Initial Commit\" && git push'" >> ~/.bashrc
source ~/.bashrcecho "alias push='git add . && git commit -m \"Initial Commit\" && git push'" >> ~/.bashrc
source ~/.bashrcecho "alias push='git add . && git commit -m \"Initial Commit\" && git push'" >> ~/.bashrc
source ~/.bashrcecho "alias push='git add . && git commit -m \"Initial Commit\" && git push'" >> ~/.bashrc
source ~/.bashrcecho "alias push='git add . && git commit -m \"Initial Commit\" && git push'" >> ~/.bashrc
source ~/.bashrcecho "alias push='git add . && git commit -m \"Initial Commit\" && git push'" >> ~/.bashrc
source ~/.bashrcecho "alias push='git add . && git commit -m \"Initial Commit\" && git push'" >> ~/.bashrc
source ~/.bashrcecho "alias push='git add . && git commit -m \"Initial Commit\" && git push'" >> ~/.bashrc
source ~/.bashrc