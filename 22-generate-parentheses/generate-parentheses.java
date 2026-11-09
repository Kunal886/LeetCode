class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l=new ArrayList<>();
        parenthesis(n,0,0,"",l);
        return l;

    }
    public static void parenthesis(int n,int open,int close,String ans,List<String> l){
        if(open==n && close==n){
            l.add(ans);
            return;
        }
        if(open>n || close>open){
            return;
        }
        parenthesis(n,open+1,close,ans+"(",l);
        parenthesis(n,open,close+1,ans+")",l);
    }
}