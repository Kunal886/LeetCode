class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int [] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=greater(nums,nums[i],i);
        }
        return ans;
        
    }
    public static int greater(int [] arr,int k,int j){
        int [] check=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            check[i]=arr[i];
        }
       // Arrays.sort(check);
       
        for(int i=j;i<arr.length;i++){
            if(check[i]>k){
                
                return check[i];
            }
        }

        for(int i=0;i<j;i++){
            if(check[i]>k){
                
                return check[i];
            }
        }
     
        return -1;
    }
}