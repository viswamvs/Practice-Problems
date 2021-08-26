// GP Term 
// Given the first 2 terms A and B of a Geometric Series. 
// The task is to find the Nth term of the series.

// Input:
// A = 2 
// B = 3
// N = 1
// Output: 2
// Explanation: The first term is already
// given in the input as 2

class Solution
{
    
    public double termOfGP(int A,int B,int N)
    {
        //Your code here
        double r = (double)B / (double)A;
        return (double) (A*Math.pow(r, N-1));
    }

}