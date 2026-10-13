class Solution {
    public long maxAlternatingSum(int[] nums) {

        for(int i=0;i<nums.length;i++){
           nums[i]=nums[i]*nums[i];
        }

        long ans=0;
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            if(i<nums.length/2){
                ans-=nums[i];
            }
            else{
                ans+=nums[i];
            }
        }

        return ans;
       
        
    }
}