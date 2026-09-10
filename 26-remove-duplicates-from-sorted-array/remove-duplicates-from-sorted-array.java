class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int a=0;
        for(int i=0;i<nums.length;i++){
          
            if(set.contains(nums[i])){
                continue;
            }
            else
            nums[a++]=nums[i];

              set.add(nums[i]);
        }
      
       
        return set.size();
    }
}