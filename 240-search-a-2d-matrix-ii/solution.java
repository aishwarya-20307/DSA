// 3 ms | 48.5 MB
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totalRow = matrix.length;
        int totalCol = matrix[0].length;

        int row=0;
        int col=totalCol-1;
        while(row < totalRow && col >= 0){
            if(matrix[row][col] == target){
                return true ;
            }else if(matrix[row][col] > target){
                //move left 
                col--;
            }else{
                // move down 
                row++;
            }
        }     
        return false;   
    }
}