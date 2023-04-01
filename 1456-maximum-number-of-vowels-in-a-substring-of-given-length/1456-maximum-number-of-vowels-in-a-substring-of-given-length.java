class Solution {
    public int maxVowels(String s, int k) {
        int n=s.length();
        int i=0,j=0;
        int count=0,ans=Integer.MIN_VALUE;
        while(j<n){
            if(isVowel(s.charAt(j))) count++;
            if(j-i+1<k) j++;
            else if(j-i+1==k){
                ans=Math.max(count,ans);
                if(isVowel(s.charAt(i))) count--;
                i++;
                j++;
            }
        }
        return ans;
    }
    private boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
}