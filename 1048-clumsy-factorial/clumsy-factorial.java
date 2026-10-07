class Solution {
    public int clumsy(int n) {

        long ans = 0;
        long clumsy = n;
        int a=4;
        for (int i = n - 1; i > 0; i--){
            if (a==4) clumsy *= i;
            
            else if (a==3) clumsy/=i;
    
            else if (a == 2) {
                ans+=clumsy;
                clumsy = i;
            }
            else {
                ans+=clumsy;
                clumsy=-i;
            }
            a--;
            if (a==0)  a=4;
    
        }
        ans+=clumsy;
        return (int) ans;
    }
}