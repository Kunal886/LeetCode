class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {  
        List<List<Integer>> ll=new ArrayList<>();
        List<Integer> l=new ArrayList<>();

        combination(candidates,target,0,0,l,ll);
        
        return ll;

    }
    public static void combination(int[] candidates,int target,int i,int ans,List<Integer> l,List<List<Integer>> ll){
        if(target==ans){
            ll.add(new ArrayList<>(l));
            return;
        }
        if(ans>target || i>=candidates.length){
            return;
        }

        l.add(candidates[i]);
        combination(candidates,target,i,ans+candidates[i],l,ll);

        l.remove(l.size()-1);

        combination(candidates,target,i+1,ans,l,ll);
    }
}