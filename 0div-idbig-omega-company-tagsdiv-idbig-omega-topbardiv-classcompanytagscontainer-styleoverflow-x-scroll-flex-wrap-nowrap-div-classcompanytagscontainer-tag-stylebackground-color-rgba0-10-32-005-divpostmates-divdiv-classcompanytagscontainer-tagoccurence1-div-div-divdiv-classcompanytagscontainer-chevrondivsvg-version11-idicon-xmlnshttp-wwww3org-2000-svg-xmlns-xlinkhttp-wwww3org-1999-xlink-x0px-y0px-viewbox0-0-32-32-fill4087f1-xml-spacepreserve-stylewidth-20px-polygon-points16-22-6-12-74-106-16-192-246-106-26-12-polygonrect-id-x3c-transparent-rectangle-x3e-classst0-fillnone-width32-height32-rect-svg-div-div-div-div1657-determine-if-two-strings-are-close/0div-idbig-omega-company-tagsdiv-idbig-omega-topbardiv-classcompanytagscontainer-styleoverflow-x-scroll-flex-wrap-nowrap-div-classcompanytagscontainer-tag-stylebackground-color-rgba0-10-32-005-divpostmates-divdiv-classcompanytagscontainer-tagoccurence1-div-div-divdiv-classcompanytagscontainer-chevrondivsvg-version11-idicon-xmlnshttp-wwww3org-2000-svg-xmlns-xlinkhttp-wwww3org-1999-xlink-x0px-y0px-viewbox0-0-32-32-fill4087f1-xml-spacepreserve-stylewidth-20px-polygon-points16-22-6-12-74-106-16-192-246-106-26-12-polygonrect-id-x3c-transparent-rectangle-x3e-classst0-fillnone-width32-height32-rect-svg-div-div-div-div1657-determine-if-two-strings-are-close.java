class Solution {
    public boolean closeStrings(String word1, String word2) {
        int n = word1.length() , m = word2.length();
        if(n != m)
            return false;

        int[]hash1=new int[26];
        int[]hash2=new int[26];

        for(int i=0;i<n;i++){
            hash1[word1.charAt(i)-'a']++;
            hash2[word2.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if((hash1[i] == 0 && hash2[i] != 0) || (hash1[i] != 0 && hash2[i] ==0))
                return false;
        }
        Arrays.sort(hash1);
        Arrays.sort(hash2);

        return Arrays.equals(hash1,hash2);
        
    }
}