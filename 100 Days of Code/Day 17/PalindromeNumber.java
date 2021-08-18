// Palindrome Number

// Given an integer x, return true if x is palindrome integer.

// An integer is a palindrome when it reads the same backward as forward. 
// For example, 121 is palindrome while 123 is not.

// Input: x = 121
// Output: true

// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, 
// it becomes 121-. Therefore it is not a palindrome.

class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        int rev = 0;
        int revDigit = x;
        while(revDigit > 0)
        {
            int ld = revDigit % 10;
            rev = rev * 10 + ld;
            revDigit = revDigit/10;
        }
        return (rev == x);
    }
}