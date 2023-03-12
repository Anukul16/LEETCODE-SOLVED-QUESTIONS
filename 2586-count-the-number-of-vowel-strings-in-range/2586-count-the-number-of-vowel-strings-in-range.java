class Solution {
    public int vowelStrings(String[] words, int left, int right) {
       
        int ans=0;
        for(int i=left;i<=right;i++)
        {
            char ch1=words[i].charAt(0);
            char ch2=words[i].charAt(words[i].length()-1);
            if((ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u') && (ch2=='a'||ch2=='e'||ch2=='i'||ch2=='o'||ch2=='u'))
            {
                ans++;
            }
        }
        return ans;
    }
}