class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list=new ArrayList<>();

        char [] ch=p.toCharArray();
        Arrays.sort(ch);

        for(int i=0;i<=s.length()-p.length();i++){
            String t=s.substring(i,i+p.length());
            char [] c=t.toCharArray();
            Arrays.sort(c);
            if(Arrays.equals(ch,c)){
                list.add(i);
            }
        }
        return list;
    }
}