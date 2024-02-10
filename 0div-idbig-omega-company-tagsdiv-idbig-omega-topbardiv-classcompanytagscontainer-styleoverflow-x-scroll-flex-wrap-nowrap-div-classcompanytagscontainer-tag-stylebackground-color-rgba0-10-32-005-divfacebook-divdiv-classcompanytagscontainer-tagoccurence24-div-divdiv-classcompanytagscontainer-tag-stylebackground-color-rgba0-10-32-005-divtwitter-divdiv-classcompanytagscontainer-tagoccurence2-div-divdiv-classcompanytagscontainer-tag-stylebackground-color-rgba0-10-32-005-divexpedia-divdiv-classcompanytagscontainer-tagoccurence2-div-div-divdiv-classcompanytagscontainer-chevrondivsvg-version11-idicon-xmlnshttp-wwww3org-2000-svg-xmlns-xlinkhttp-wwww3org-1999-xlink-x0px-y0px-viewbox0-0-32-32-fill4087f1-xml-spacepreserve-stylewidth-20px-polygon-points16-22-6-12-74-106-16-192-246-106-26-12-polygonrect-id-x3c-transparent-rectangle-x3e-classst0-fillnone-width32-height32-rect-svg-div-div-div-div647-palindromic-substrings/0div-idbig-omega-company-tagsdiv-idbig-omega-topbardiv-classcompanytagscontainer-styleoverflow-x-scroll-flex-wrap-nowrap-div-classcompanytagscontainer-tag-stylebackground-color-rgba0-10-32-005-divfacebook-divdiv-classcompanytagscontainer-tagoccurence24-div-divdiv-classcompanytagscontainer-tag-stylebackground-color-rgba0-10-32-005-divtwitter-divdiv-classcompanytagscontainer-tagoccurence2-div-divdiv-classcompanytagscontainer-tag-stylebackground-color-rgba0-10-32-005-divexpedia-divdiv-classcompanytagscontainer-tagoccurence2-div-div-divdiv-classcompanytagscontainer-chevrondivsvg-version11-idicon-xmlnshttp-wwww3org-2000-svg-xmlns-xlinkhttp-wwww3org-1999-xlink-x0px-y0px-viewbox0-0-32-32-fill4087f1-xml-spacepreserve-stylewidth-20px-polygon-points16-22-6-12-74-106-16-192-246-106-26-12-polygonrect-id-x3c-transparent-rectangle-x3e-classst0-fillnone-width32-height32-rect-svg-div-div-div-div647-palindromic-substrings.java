class Solution {
    
    public int countSubstrings(String s) {
        
        int count = s.length();

        for (int gap=1; gap < s.length(); gap++) {
            for (int i=0; i + gap < s.length(); i++) {
                if (helper(s, i, i + gap)) {
                    count++;    
                }
            }
        }
        
        return count;
    }
    
    private boolean helper(String s, int l, int r) {
        if (l >= r) {
            return true;
        }
                
        if (s.charAt(l) == s.charAt(r)) {
            if (helper(s, l + 1, r - 1)) {
                return true;
            } else {
                return false;    
            }
        }
        
        return false;
    }
}