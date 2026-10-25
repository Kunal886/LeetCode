class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) { 
        List<List<Integer>> ll=new ArrayList<>();
        List<Integer> l=new ArrayList<>();

        combination(candidates,target,0,l,ll);
        
        return ll;

    }
    public static void combination(int[] candidates,int target,int idx,List<Integer> l,List<List<Integer>> ll){
        if(target==0){
            ll.add(new ArrayList<>(l));
            return;
        }
      for(int i=idx;i<candidates.length;i++){
        if(target>=candidates[i]){
            l.add(candidates[i]);
          combination(candidates,target-candidates[i],i,l,ll);
          l.remove(l.size() - 1);
        }
    }
    }
}