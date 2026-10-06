class Solution {
    public String shiftingLetters(String s, int[] shifts) {
          char[] arr = s.toCharArray();

        shifts[shifts.length - 1] %= 26;
        for (int i = shifts.length - 2; i >= 0; i--) {
            shifts[i] = (shifts[i] + shifts[i + 1])%26;
        }

       
        for (int i = 0; i < arr.length; i++) {
            int a =(shifts[i]+s.charAt(i));
            if(a>122){
                a=a-26;
            }

            arr[i] = (char) (a);
        }
         return new String(arr);
    }
}