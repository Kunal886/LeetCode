class Solution {
    public int maxSubarraySumCircular(int[] nums) {
    int totalsum=0;

    int maxsum=Integer.MIN_VALUE;
    int minsum=Integer.MAX_VALUE;
    int currentmax=0;
    int currentmin=0;

    for(int i=0;i<nums.length;i++){
        totalsum+=nums[i];

        currentmax+=nums[i];
        maxsum=Math.max(maxsum,currentmax);

        if (currentmax<0) {
            currentmax=0;
        }
        currentmin+=nums[i];
        minsum=Math.min(minsum,currentmin);
        if(currentmin>0){
            currentmin=0;
        }
    }
    if(maxsum<0){
        return maxsum;
    }
    return Math.max(maxsum,(totalsum-minsum));


    }
}