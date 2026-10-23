class Solution {
    public String finalString(String s) {
        String st="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='i'){
                st+=s.charAt(i);
            }
            else{
               st= rev(st);
            }
        }
        return st;
        
    }
    String rev(String p){
        char[] ch=p.toCharArray();
        int i=0;
        int j=ch.length-1;
        while(i<j){
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        return new String(ch);
    }
}