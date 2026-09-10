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