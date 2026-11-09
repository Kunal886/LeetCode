class Solution {
    public void nextPermutation(int[] nums) {
        int a=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                a=i;
                break;
            }
        }
     if(a!=-1){
       for(int i=nums.length-1;i>a;i--){
            if(nums[i]>nums[a]){
                int temp=nums[i];
                nums[i]=nums[a];
                nums[a]=temp;
                break;
            }
       }
       }

         rev(a+1,nums);

    }
    public static void rev(int i,int[] nums){
        int j=nums.length-1;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}