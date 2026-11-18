class Solution {
    public int calPoints(String[] arr) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
           
            if(arr[i].equals("C")){
                st.pop();
            }
            else if(arr[i].equals("+")){
                int x=st.pop();
                int y=st.pop();
                int z=x+y;
                st.push(y);
                st.push(x);
                st.push(z);
            }
            else if(arr[i].equals("D")){
                st.push(2*st.peek());
            }
            else st.push(Integer.parseInt(arr[i]));
        }
        int record=0;
        for(int i:st){
            record+=i;
        }
        return record;

    }
}