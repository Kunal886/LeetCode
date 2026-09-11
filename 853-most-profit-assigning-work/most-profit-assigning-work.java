class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {

        int maxProfit=0;

        for (int w:worker) {
            int best=0;

            for (int i=0;i<difficulty.length;i++){
                if (difficulty[i]<=w){
                    best=Math.max(best,profit[i]);
                }
            }
            maxProfit+=best;
        }

        return maxProfit;
    }
}
