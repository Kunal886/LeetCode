class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ll=new ArrayList<>();
        List<Integer> l=new ArrayList<>();

        permutation(nums,0,l,ll);
        return ll;


    }
    public static void permutation(int [] nums,int i,List<Integer> l,List<List<Integer>> ll){
        if(l.size()==nums.length){
            ll.add(new ArrayList<>(l));
            return;
        }
        if(i>=nums.length) return ;

        if (!l.contains(nums[i])) {
            l.add(nums[i]);
            permutation(nums,0,l,ll);

            l.remove(l.size() - 1);
        }

          permutation(nums,i+1,l,ll);
        
    }
}