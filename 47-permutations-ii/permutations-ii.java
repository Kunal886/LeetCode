class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ll=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        boolean [] used=new boolean[nums.length];

        permut(nums,0,used,ll,l);
        return ll;

    }
    public static void permut(int [] nums,int i,boolean [] used,List<List<Integer>> ll,List<Integer>l){
        if(l.size()==nums.length){
            ll.add(new ArrayList(l));
            return;
        }
        if(i>=nums.length) return;

        if(!used[i]){
            if(i>0 && nums[i]==nums[i-1] && !used[i-1]){
                permut(nums,i+1,used,ll,l);
                return ;
            }
            l.add(nums[i]);
            used[i]=true;
            permut(nums,0,used,ll,l);
            used[i]=false;
            l.remove(l.size()-1);
        }
        permut(nums,i+1,used,ll,l);

    }
}