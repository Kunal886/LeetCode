class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ll=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        combination(k,n,0,1,ll,l);
        return ll;


    }
    public static void combination(int k,int n,int ans,int i,List<List<Integer>>ll,List<Integer> l){
        if(ans==n && l.size()==k){
            ll.add(new ArrayList(l));
            return ;
        }
        if(i>9) return ;
        l.add(i);
        combination(k,n,ans+i,i+1,ll,l);
        l.remove(l.size()-1);
         combination(k,n,ans,i+1,ll,l);

    }
}