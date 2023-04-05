class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int n=s.length();
        HashMap<Character,Integer>map=new HashMap<>();
        int left=0,right=0,ans=0;
        while(right<n){
            char ch=s.charAt(right);
            if(map.containsKey(ch)){
                left=Math.max(map.get(ch)+1,left);
            }
            map.put(ch,right);
            ans=Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }
}
/*

int n=s.length();
        Set<Character>set=new HashSet<>();
        int i=0,j=0,ans=0;
        while(j<n){
            char ch=s.charAt(j);
            while(set.contains(ch)){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(ch);
            ans=Math.max(ans,j-i+1);
            j++;
        }
        return ans;


*/