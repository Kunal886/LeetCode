class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map=new HashMap<>();
        
        
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        for(int i=0;i<=s2.length()-s1.length();i++){
             HashMap<Character,Integer> map1=new HashMap<>();
            String s=s2.substring(i,i+s1.length());
             for(int j=0;j<s.length();j++){
            char chh=s.charAt(j);
            map1.put(chh,map1.getOrDefault(chh,0)+1);
        }
        if(map.equals(map1)){
            return true;
        }

        }
        return false;
    }
}