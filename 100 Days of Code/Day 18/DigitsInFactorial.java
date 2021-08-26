// Given an integer N. Find the number of digits that appear in its factorial. 
// Factorial is defined as, factorial(n) = 1*2*3*4……..*N and factorial(0) = 1.
// Input: N = 5
// Output: 3
// Explanation: Factorial of 5 is 120.
// Number of digits in 120 is 3 (1, 2, and 0)

class Solution{
    public int digitsInFactorial(int n){
        double M_E = 2.71828182845904523536;
        double M_PI = 3.141592654;
        if (n < 0)
            return 0;
 
        // base case
        if (n <= 1)
            return 1;
 
        double x = (n * Math.log10(n / M_E) +
                    Math.log10(2 * M_PI * n) /
                    2.0);
 
        return (int)Math.floor(x) + 1;
    }
}
