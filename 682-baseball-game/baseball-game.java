class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            char ch=operations[i].charAt(0);
            if(ch=='C'){
                st.pop();
            }
            else if(ch=='+'){
                int x=st.pop();
                int y=st.pop();
                int z=x+y;
                st.push(y);
                st.push(x);
                st.push(z);
            }
            else if(ch=='D'){
            
                st.push(2*st.peek());
            }
            else st.push(Integer.parseInt(operations[i]));
        }
        int record=0;
        for(int i:st){
            record+=i;
        }
        return record;

    }
}