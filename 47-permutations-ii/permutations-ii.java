class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ll=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        boolean [] used=new boolean[nums.length];

        permutation(nums,used,0,l,ll);
        return ll;
    }
    public static void permutation(int [] nums,boolean [] used,int i,List<Integer> l,List<List<Integer>> ll){
        if(l.size()==nums.length){
            ll.add(new ArrayList<>(l));
            return;
        }
      if(i>=nums.length) return ;
      if(!used[i]){
        if(i > 0 && nums[i] == nums[i-1] && !used[i-1]) {
                permutation(nums, used, i+1, l, ll);
                return;
            }

        l.add(nums[i]);
         used[i] =true;
        permutation(nums,used,0,l,ll);
         used[i] =false;

       
        l.remove(l.size()-1);
     
      }
      permutation(nums,used,i+1,l,ll);

        
    }
}