class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int [] pre=new int[nums.length+1];
 
        int count=0;
        pre[0]=0;
        for(int i=1;i<nums.length+1;i++){
            pre[i]=pre[i-1]+nums[i-1];
           
        }
        for(int i=0;i<nums.length+1;i++){
            int a=pre[i]-k;
            if(map.containsKey(a)){
                count=count+map.get(a);
            }
            map.put(pre[i],map.getOrDefault(pre[i],0)+1);
        }

        return count;
        
    } 
}