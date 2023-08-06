//Recursive Fibonacci
//Time Complexity: θ(2^n)
//Space Complexity: θ(n)
class Solution {
    public int fib(int n) {
        if (n <= 1){
            return n;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }
}

//Iterative Fibonacci
//Time Complexity: θ(2)
class Solution {
    public int fib(int n) {
        int a = 0;
        int b = 1;
        int c, i;
        if(n == 0) return 0;
        for (i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}