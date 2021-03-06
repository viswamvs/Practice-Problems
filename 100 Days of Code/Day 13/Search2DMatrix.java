// Search a 2D Matrix

// Write an efficient algorithm that searches for a value in an m x n matrix. 
// This matrix has the following properties:

// 1. Integers in each row are sorted from left to right.
// 2. The first integer of each row is greater than the last integer of the previous row.

// Input: matrix = [[1,3,5,7],
//                 [10,11,16,20],
//                 [23,30,34,60]], target = 3
// Output: true

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        int j = matrix[i].length - 1;
        int r = matrix.length;
        while(i<r && j >= 0)
        {
            if(matrix[i][j] == target)
                return true;
            else if(matrix[i][j] > target)
                j--;
            else
                i++;
        }
        return false;
    }
}