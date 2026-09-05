class Solution {
    public String convert(String s, int numRows) {
        
        if (numRows == 1 || numRows >= s.length()) {
            return s;
           }

        int n=s.length();
        char [][] arr=new char[numRows][n];

        for(int i=0;i<numRows;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=' ';
            }
        }

        int r=0;
        int c=0;
        int index=0;

         boolean down = true;

        while (index < s.length()){
            arr[r][c]=s.charAt(index++);

            if(down){
                r++;
                if(r==numRows){
                    r=numRows-2;
                    c++;
                    down=false;
                }
            }
            else{
                r--;
                c++;
                 if (r < 0) {
                    r = 1;
                    down = true;
                }
            }
        }
        String ans="";
         for(int i=0;i<numRows;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]!=' '){
                    ans+=arr[i][j];
                }
            }
         }
            return ans;

    }
}