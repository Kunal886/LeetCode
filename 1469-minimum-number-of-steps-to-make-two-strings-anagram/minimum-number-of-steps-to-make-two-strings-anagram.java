class Solution {
    public int minSteps(String s, String t) {

        HashMap<Character,Integer>map=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char chh=t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            map2.put(chh,map2.getOrDefault(chh,0)+1);
        }
        int ans=0;
        //if(map.equals(map2)) return 0;
        for(char ch:map.keySet()){
            int counts=map.get(ch);
            int countt=map2.getOrDefault(ch,0);
            if(counts-countt>0){
                ans+=counts-countt;
            }
        }
        return ans;
    }
}