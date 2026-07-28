// Iterative

while(b!=0){
    int temp = b;
    b = a% b;
    a = temp;
}

// Recursive
if(b ==0) return a;
return gcd (b , a% b);

