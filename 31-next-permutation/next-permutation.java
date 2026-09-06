class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
       int a=-1;
       for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                a=i;
                break;
            }
       }
       if(a!=-1){
       for(int i=n-1;i>a;i--){
            if(nums[i]>nums[a]){
                int temp=nums[i];
                nums[i]=nums[a];
                nums[a]=temp;
                break;
            }
       }
       }
       reverse(nums,a+1,n-1);
    }
    public int[] reverse(int [] arr,int a,int b){
        while(a<b){
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            a++;
            b--;
        }
        return arr;
    }
}