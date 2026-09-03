class Solution {
    public boolean uniformArray(int[] nums1) {
        Arrays.sort(nums1);
        int smallestodd=0;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2!=0){
               smallestodd=nums1[i];
               break;
            }
        }
        if(smallestodd==0){
            return true;
        }
        for(int i=0;i<nums1.length;i++){
            boolean b=false;
            if(nums1[i]%2!=0) continue;
            else{
                    if(nums1[i]-smallestodd>=1){
                        b=true;
                        break;
                    }
                }
                if(!b) return false;
                
            }
        
        return true;
    }
}