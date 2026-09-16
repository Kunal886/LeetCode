class Solution {
    public int[][] generateMatrix(int n) {
        int [] [] matrix=new int[n][n];
         int frow=0;
        int lrow=n-1;
        int fcol=0;
        int lcol=n-1;
        int a=1;
        
        while(frow<=lrow && fcol<=lcol){
        for(int i=fcol;i<=lcol;i++){
            matrix[frow][i]=a++;
        }
        frow++;
        for(int i=frow;i<=lrow;i++){
            matrix[i][lcol]=a++;
        }
        lcol--;
        if(frow<=lrow){
        for(int i=lcol;i>=fcol;i--){
            matrix[lrow][i]=a++;
        }
        lrow--;
        }
        if(fcol<=lcol){
        for(int i=lrow;i>=frow;i--){
            matrix[i][fcol]=a++;
        }
        fcol++;
        }
        }


        return matrix;
    }
}