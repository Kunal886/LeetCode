class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ll=new ArrayList<>();
        List<Integer> l=new ArrayList<>();

        combination(k,n,1,0,l,ll);
        return ll;


    }
    public static void combination(int k,int n,int i,int ans,List<Integer> l,List<List<Integer>> ll){
         if(ans==n && l.size()==k){
            ll.add(new ArrayList<>(l));
            return;
        }
        if(i>9 || ans>n || l.size()>k) return ;

        l.add(i);
        combination(k,n,i+1,ans+i,l,ll);

        l.remove(l.size()-1);
        combination(k,n,i+1,ans,l,ll);
    }
}