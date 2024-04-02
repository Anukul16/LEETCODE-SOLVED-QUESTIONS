class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length())return false;
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(s.lastIndexOf(c1) != t.lastIndexOf(c2))return false;
        }
        return true;
    }
}