class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length()-1;
        boolean get_first_char=false;
        int length = 0;
        while(i>=0){
            if(get_first_char==true && s.charAt(i) == ' ')return length;
            if(get_first_char || s.charAt(i)>=97 && s.charAt(i)<=122 || s.charAt(i)>=65 && s.charAt(i)<=97){
                get_first_char=true;
                length++;
            }
            i--;
        }
        return length;
    }
}