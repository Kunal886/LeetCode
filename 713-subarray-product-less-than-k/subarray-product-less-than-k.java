class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i=0;
        int j=0;
        int count=0;
        int product=1;
        while(j<nums.length){
            while(j<nums.length && product*nums[j]<k){
                product*=nums[j];
                count++;
                j++;
            }
            product=1;
            i++;
            j=i;
        }
        return count;
    }
}