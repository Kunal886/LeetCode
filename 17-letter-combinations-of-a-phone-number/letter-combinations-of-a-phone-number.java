class Solution {

    static String [] s={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> l=new ArrayList<>();
        combination(digits,"",l);
        return l;


    }
    public static void combination(String digits,String ans,List<String> l){
        if(digits.length()==0){
            l.add(ans);
            return;
        }
        char ch=digits.charAt(0);
        String str=s[ch-'0'];

        for(int i=0;i<str.length();i++)
        combination(digits.substring(1),ans+str.charAt(i),l);
    }
}