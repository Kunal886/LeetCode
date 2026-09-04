class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<allowed.length();i++){
            char ch=allowed.charAt(i);
            set.add(ch);
        }
        int ans=0;
        for(int i=0;i<words.length;i++){
            String s=words[i];
            boolean b=true;
            for(int j=0;j<s.length();j++){
                char chh=s.charAt(j);
                if(!set.contains(chh)) b=false;
            }
            if(b) ans++;
        }
        return ans;
    }
}