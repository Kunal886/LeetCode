class Solution {
    public String smallestNumber(String pattern) {
        Stack<Integer> st=new Stack<>();
        int [] ans=new int[pattern.length()+1];
        int c=1;

        for(int i=0;i<=pattern.length();i++){
            if(i==pattern.length() || pattern.charAt(i)=='I'){
                ans[i]=c++;
                while(!st.isEmpty()){
                    ans[st.pop()]=c++;
                }
            }
                else{
                    st.push(i);
                }
            
        }
        // return Arrays.toString(ans);
        String a="";
        for(int i=0;i<ans.length;i++){
            a+=ans[i];
        }
        return a;

         }
    }
