class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ll=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();

        for(int i=0;i<strs.length;i++){
            char [] s=strs[i].toCharArray();
            Arrays.sort(s);
            String st=new String(s);
            if(map.containsKey(st)){
                map.get(st).add(strs[i]);
            }     
            else{
                List<String> l=new ArrayList<>();
                l.add(strs[i]);
                map.put(st,l);
            }
        }
        for(String i:map.keySet()){
            ll.add(map.get(i));
        }
        return ll;
    }
}