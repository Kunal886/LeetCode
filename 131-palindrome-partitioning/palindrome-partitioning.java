class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ll=new ArrayList<>();
        List<String> l=new ArrayList<>();
       
       partition(s,ll,l);
       return ll;



    }
    public static void partition(String ques,List<List<String>> ans,List<String> l){
        if(ques.length()==0){
            ans.add(new ArrayList(l));
            return;
        }
         for(int i=1;i<=ques.length();i++){
            String s=ques.substring(0,i);
            if(check(s)) {
                l.add(s);
                partition(ques.substring(i),ans,l);
                l.remove(l.size()-1);
            }
        }
    }



    public static boolean check(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}