//Given an m x n matrix, return all elements of the matrix in spiral order.

//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [1,2,3,6,9,8,7,4,5]


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        int top = 0, left = 0, bottom = matrix.length-1;
        int right = matrix[0].length-1;
        while(top <= bottom && left <= right)
        {
            for(int i=left;i<=right;i++)
                l.add(matrix[top][i]);
            top++;
            for(int i=top;i<=bottom;i++)
                l.add(matrix[i][right]);
            right--;
            if(top <= bottom)
            {
                for(int i=right;i>=left;i--)
                    l.add(matrix[bottom][i]);
                bottom--;
            }
            if(left <= right)
            {
                for(int i=bottom;i>=top;i--)
                    l.add(matrix[i][left]);
                left++;
            }
        }
        return l;
    }
}