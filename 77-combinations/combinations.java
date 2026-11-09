class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ll=new ArrayList<>();
        List<Integer> l=new ArrayList<>();

        combination(n,k,1,ll,l);
        return ll;

    }
    public static void combination(int n,int k,int i,List<List<Integer>> ll,List<Integer> l){
        if(l.size()==k){
            ll.add(new ArrayList(l));
            return;
        }
        if(i>n) return;

        l.add(i);
        combination(n,k,i+1,ll,l);

        l.remove(l.size()-1);
        combination(n,k,i+1,ll,l);

    }
}