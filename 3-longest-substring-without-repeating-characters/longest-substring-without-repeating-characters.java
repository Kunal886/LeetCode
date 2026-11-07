class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();

        int j=0;
        int max=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            while(set.contains(ch)){
                 set.remove(s.charAt(j));
                    j++;
                 
            }
           
            set.add(ch);
            max=Math.max(max,i-j+1);
                 
        }
        return max;
    }
}