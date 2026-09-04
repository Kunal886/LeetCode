class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
      
        for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE;
            max=Math.max(nums[i],max);

            for(int j=i;j<n;j++){
              min=Math.min(nums[j],min);
            }
            if(max-min<=k) return i;
        }
        return -1;
    }
}