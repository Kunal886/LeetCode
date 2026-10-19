class Solution {
    static String [] s={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> ll=new ArrayList<>();
     
        combination(digits,"",ll);
        return ll;
    }
    public static void combination(String ques,String ans,List<String> ll){
        
        if(ques.length()==0){
            ll.add(ans);
            return;
        }

       char ch=ques.charAt(0);
        String str=s[ch-'0'];

        for(int a=0;a<str.length();a++)
        combination(ques.substring(1),ans+str.charAt(a),ll);
    }
}