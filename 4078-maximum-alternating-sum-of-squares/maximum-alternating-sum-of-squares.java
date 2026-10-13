class Solution {
    public long maxAlternatingSum(int[] nums) {

        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                nums[i]=-nums[i];
            }
        }

        long ans=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i<nums.length/2){
                ans-=nums[i]*nums[i];
            }
            else{
                ans+=nums[i]*nums[i];
            }
        }

        return ans;
       
        
    }
}