class Solution {
    public String reversePrefix(String word, char ch) {
        
        int n = word.length() , idx = 0 , chIndex = -1;
        String ans = "";
        boolean found = false;
        
        while(idx>=0 && idx<n){
            if(found || word.charAt(idx) == ch){
                if(chIndex == -1){
                    chIndex = idx;
                }
                found = true;
                ans+=word.charAt(idx--);
            }else{
                idx++;
            }
        }
        // System.out.println(chIndex+1);
        idx=chIndex+1;
        while(idx<n){
            // System.out.println(ans+" "+word.charAt(idx));
            ans+=word.charAt(idx++);
        }
        return ans;
    }
}