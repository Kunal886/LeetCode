class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ll=new ArrayList<>();
        List<Integer> l=new ArrayList<>();

        combination(candidates,target,0,0,l,ll);

        return ll;
        
    }
    public static void combination(int [] candidates, int target,int i,int ans,List<Integer> l,List<List<Integer>> ll){
        if(ans==target){
           // Collections.sort(l);
        //    if(!ll.contains(l))
            ll.add(new ArrayList<>(l));
            return;
        }
        if(i>=candidates.length || ans>target){
            return;
        }

         l.add(candidates[i]);
         combination(candidates,target,i+1,ans+candidates[i],l,ll);

         l.remove(l.size()-1);

         int next = i+1;
        while (next < candidates.length &&
               candidates[next] == candidates[i]) {
            next++;
        }
        combination(candidates,target,next,ans,l,ll);

    }
}