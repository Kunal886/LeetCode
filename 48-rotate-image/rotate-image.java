class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int [][] ans=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[i][j]=matrix[j][i];
            }
        }
        
        for(int i=0;i<n;i++){
            int b=0;
            for(int j=m-1;j>=0;j--){
                matrix[i][b++]=ans[i][j];
            }
        }
    }
}