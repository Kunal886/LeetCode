class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ll=new ArrayList<>();

        String[] letters = {"","", "abc","def","ghi", "jkl","mno", "pqrs","tuv","wxyz"};

        combinations(letters,digits,"",0,ll);
        return ll;


    }
    public static void combinations(String [] letters,String digits,String ans, int index,List<String> ll){

        if(ans.length()== digits.length()){
            ll.add(ans);
            return;
        }

        int digit = digits.charAt(index) - '0';
        String str = letters[digit];

        for(int i=0;i<str.length();i++){
             combinations( letters,digits,ans + str.charAt(i),index + 1,ll);
        }
        
    }

}
  
