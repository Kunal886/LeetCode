class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int j=matrix[0].length-1;
        int i=0;

      while(i<m && j>=0){
        if(matrix[i][j]==target){
            return true;
        }
        if(matrix[i][j]>target){
            j--;
            
        }
        else if(matrix[0][j]<target) {
           i++;
        }
      }
    //   System.out.print(j);
      
     
      return false;
    }
}