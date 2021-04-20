package com.company;

public class PowerSet {

    public void powerSet(String str)
    {
        int n = str.length();

        int powSize = (int)Math.pow(2, n);

        for(int counter = 0; counter < powSize; counter++)
        {
            for(int j = 0; j < n; j++)
            {
                if((counter & (1 << j)) != 0)
                    System.out.print(str.charAt(j));
            }

            System.out.println();
        }
    }
}
