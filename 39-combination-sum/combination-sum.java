class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ll=new ArrayList<>();
        List<Integer> l=new ArrayList<>();

        combination(candidates,target,0,ll,l);
        return ll;

    }
    public static void combination(int [] nums,int target,int i,List<List<Integer>> ll,List<Integer> l){
        if(target==0){
            ll.add(new ArrayList(l));
            return;
        }
        for(int idx=i;idx<nums.length;idx++){
            if(target>=nums[idx]){
                l.add(nums[idx]);
                combination(nums,target-nums[idx],idx,ll,l);
                l.remove(l.size()-1);
            }
        }
    }
}