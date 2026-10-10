class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
       
        int i=1;
        int j=10000000;
        int ans=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            double time=0;

            for(int k=0; k<dist.length-1;k++){
                time+=Math.ceil(dist[k]/(double)mid);
            }
             time+=dist[dist.length-1]/(double) mid;

            if(time<=hour){
                j=mid-1;
                ans=mid;
            }
            else i=mid+1;
        }
        return ans;
    }
}