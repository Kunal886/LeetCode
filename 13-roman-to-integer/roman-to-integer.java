class Solution {
    public int romanToInt(String s) {
      int num=0;
       for(int i=1;i<s.length();i++){
          
          if(s.charAt(i)=='I'){
            num++;
          }
          else if(s.charAt(i)=='V'){
            if(s.charAt(i-1)=='I'){
                num+=3;
            }
            else num+=5;
          }
          else if(s.charAt(i)=='X'){
            if(s.charAt(i-1)=='I'){
                num+=8;
            }
            else num+=10;
          }
          else if(s.charAt(i)=='L'){
            if(s.charAt(i-1)=='X'){
                num+=30;
            }
            else num+=50;
          }
           else if(s.charAt(i)=='C'){
            if(s.charAt(i-1)=='X'){
                num+=80;
            }
            else num+=100;
          }
           else if(s.charAt(i)=='D'){
            if(s.charAt(i-1)=='C'){
                num+=300;
            }
            else num+=500;
          }
            else if(s.charAt(i)=='M'){
            if(s.charAt(i-1)=='C'){
                num+=800;
            }
            else num+=1000;
          }
       }
       char ch=s.charAt(0);
       if(ch=='I') num+=1;
       else if(ch=='V') num+=5;
       else if(ch=='X') num+=10;
         else if(ch=='L') num+=50;
           else if(ch=='C') num+=100;
             else if(ch=='D') num+=500;
              else num+=1000;
       

       return num;
    }
}