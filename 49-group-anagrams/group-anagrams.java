class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char arr[]=strs[i].toCharArray();
            Arrays.sort(arr);

            String s=new String(arr);
            if(map.containsKey(s)){
                map.get(s).add(strs[i]);
            }
            else{
                ArrayList<String> list=new ArrayList<>();
                list.add(strs[i]);
                map.put(s,list);
            }
        }
        return new ArrayList<>(map.values());
    }
}