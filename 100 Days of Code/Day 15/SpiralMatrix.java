//spiral matrix



class Solution {
public int[][] generateMatrix(int n) {
        // similar to spiral matrix I,done by myself
        int[][] rs = new int[n][n];
        int top = 0,bottom = n-1,left = 0,right = n-1;
        int num = 1;
        
        while(left<=right && top <=bottom){
            for(int i=left;i<=right;i++){
                rs[top][i] = num++;
            }
            top++;
            for(int i= top;i<=bottom;i++){
                rs[i][right] = num++;
            }
            right--;
            for(int i= right;i>=left;i-- ){
                rs[bottom][i] = num++;
            }
            bottom--;
            for(int i = bottom;i>=top;i--){
                rs[i][left] = num++;
            }
            left++;
        }
        return rs;
    }
}