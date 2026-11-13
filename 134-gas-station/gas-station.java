class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas=0;
        int currentgas=0;
        int start=0;
        
        for(int i=0;i<gas.length;i++){
            int gasused=gas[i]-cost[i];
            totalgas+=gasused;
            currentgas+=gasused;

            if(currentgas<0){
                start=i+1;
                currentgas=0;
            }
        }
         return totalgas>=0 ? start : -1;
    }
}