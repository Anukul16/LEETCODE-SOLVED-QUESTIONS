class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs==null || strs.length==0)return "";
        
        Arrays.sort(strs);
        String firstWord=strs[0];
        String lastWord=strs[strs.length-1];
        int c=0;
        
        while(c<firstWord.length()){
            if(firstWord.charAt(c)==lastWord.charAt(c))c++;
            else break;
        }
        return c!=0?firstWord.substring(0,c):"";
    }
}