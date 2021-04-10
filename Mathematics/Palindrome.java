package com.company;

public class Palindrome {

    boolean isPalindrome(int n){
        int rev = 0;
        int temp = n;
        while(temp != 0){
            int ld = temp % 10;
            rev = rev * 10 + ld;
            temp = temp / 10;
        }
        return (rev == n);
    }
}
