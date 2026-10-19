class Solution {
    public boolean threeFibonacciSum(int n) {
       return   check(n,0,1);
        
    }
    public static boolean check(int n,int a,int b){
        int c=a+b;
        int sum=a+b+c;
        if(sum==n) return true;
        if(sum>n) return false;

        return  check(n,b,c);

    }
}