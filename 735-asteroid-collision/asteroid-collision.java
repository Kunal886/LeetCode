class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int i:asteroids){
            boolean alive=true;

            while(!st.isEmpty() && i<0 && st.peek()>0){
                int curr=-i;
                int top=st.peek();

                if(curr>top){
                    st.pop();
                }
                else if(curr==top){
                    st.pop();
                    alive=false;
                    break;
                }
                else{
                    alive=false;
                    break;
                }
            }
            if(alive){
                st.push(i);
            }
        }
        
        int ans[]=new int[st.size()];
        int a=0;
        for(Integer i:st){
            ans[a]=i;
            a++;
        }
        return ans;
    }
}