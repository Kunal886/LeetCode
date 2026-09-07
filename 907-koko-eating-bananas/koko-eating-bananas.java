class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxpiles=Integer.MIN_VALUE;

        for(int i:piles){
            maxpiles=Math.max(i,maxpiles);
        }
        int lo=1;
        int hi=maxpiles;
        
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;

            long time=0;
            for(int i: piles){
              //  time+=(i+mid-1)/mid;
              time+=Math.ceil((double)i/mid);
            }
            if(time<=h){
                hi=mid-1;
            }
            else lo=mid+1;
        }
        return lo;

    }
}