class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int i = (n/2 - 1) , j = n/2;
        int cnt1=0,cnt2=0;
        while(i>=0 && j<n){
            if(isVowel(s.charAt(i--)))cnt1++;
            if(isVowel(s.charAt(j++)))cnt2++;
        }
        return cnt1==cnt2;
    }
    public boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u'||
            c=='A' || c=='E' || c=='I' || c=='O' || c=='U';
    }
}