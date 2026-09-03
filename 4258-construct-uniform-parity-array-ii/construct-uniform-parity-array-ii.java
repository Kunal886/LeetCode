class Solution {
    public boolean uniformArray(int[] nums1) {
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2!=0){
                arr.add(nums1[i]);
            }
        }
        Collections.sort(arr);
        if(arr.size()==0 || arr.size()==nums1.length){
            return true;
        }
        for(int i=0;i<nums1.length;i++){
            boolean b=false;
            if(nums1[i]%2!=0) continue;
            else{
                    if(nums1[i]-arr.get(0)>=1){
                        b=true;
                       
                    }
                }
                if(!b) return false;
                
            }
        
        return true;
    }
}