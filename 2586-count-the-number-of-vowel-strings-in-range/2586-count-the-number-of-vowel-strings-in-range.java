class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int ans=0;
        while(left<=right){
            if(isVowel(words[left]))ans++;
            left++;
        }
        return ans;
    }
    private boolean isVowel(String s){
        char ch[]=s.toCharArray();
        int n=ch.length;
        if(n==1 &&(ch[0]=='a'||ch[0]=='e'||ch[0]=='i'||ch[0]=='o'||ch[0]=='u')){
            return true;
        }
        char ch1=ch[0],ch2=ch[n-1];
        if((ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u') && (ch2=='a'||ch2=='e'||ch2=='i'||ch2=='o'||ch2=='u')){
            return true;
        }
        return false;
        
    }
}