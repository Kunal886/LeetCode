class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:candyType){
            set.add(i);
        }
        int a=candyType.length/2;
        return Math.min(a,set.size());
    }
}