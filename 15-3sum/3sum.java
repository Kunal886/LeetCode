class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
          
        for(int i=0;i<nums.length;i++){
         
            if (i > 0 && nums[i] == nums[i - 1]) continue;
             
            int target=nums[i];

            int a=i+1;
            int b=nums.length-1;
            while(a<b){
                if(nums[a]+nums[b]==-target){
                    ArrayList<Integer> grid=new ArrayList<>();
                    grid.add(target);
                    grid.add(nums[a]);
                    grid.add(nums[b]);
                    list.add(grid);
                    a++;
                    b--;
                    while(a<b && nums[a]==nums[a-1]){
                        a++;
                    }
                     while(a<b && nums[b]==nums[b+1]){
                        b--;
                    }
                    
                }
                else if(nums[a]+nums[b]+target>0){
                    b--;
                }
                else a++;


            }
        }
        return list;
    }
}