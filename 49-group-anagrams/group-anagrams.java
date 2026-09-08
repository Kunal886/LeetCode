class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        for(String st:strs){
            char [] ch=st.toCharArray();
            Arrays.sort(ch);

            String s=new String(ch);
            if(map.containsKey(s)){
                map.get(s).add(st);
            }
            else{
                ArrayList<String> list=new ArrayList<>();
                list.add(st);
                map.put(s,list);
            }
        }
    
        return new ArrayList<>(map.values());
    }
}