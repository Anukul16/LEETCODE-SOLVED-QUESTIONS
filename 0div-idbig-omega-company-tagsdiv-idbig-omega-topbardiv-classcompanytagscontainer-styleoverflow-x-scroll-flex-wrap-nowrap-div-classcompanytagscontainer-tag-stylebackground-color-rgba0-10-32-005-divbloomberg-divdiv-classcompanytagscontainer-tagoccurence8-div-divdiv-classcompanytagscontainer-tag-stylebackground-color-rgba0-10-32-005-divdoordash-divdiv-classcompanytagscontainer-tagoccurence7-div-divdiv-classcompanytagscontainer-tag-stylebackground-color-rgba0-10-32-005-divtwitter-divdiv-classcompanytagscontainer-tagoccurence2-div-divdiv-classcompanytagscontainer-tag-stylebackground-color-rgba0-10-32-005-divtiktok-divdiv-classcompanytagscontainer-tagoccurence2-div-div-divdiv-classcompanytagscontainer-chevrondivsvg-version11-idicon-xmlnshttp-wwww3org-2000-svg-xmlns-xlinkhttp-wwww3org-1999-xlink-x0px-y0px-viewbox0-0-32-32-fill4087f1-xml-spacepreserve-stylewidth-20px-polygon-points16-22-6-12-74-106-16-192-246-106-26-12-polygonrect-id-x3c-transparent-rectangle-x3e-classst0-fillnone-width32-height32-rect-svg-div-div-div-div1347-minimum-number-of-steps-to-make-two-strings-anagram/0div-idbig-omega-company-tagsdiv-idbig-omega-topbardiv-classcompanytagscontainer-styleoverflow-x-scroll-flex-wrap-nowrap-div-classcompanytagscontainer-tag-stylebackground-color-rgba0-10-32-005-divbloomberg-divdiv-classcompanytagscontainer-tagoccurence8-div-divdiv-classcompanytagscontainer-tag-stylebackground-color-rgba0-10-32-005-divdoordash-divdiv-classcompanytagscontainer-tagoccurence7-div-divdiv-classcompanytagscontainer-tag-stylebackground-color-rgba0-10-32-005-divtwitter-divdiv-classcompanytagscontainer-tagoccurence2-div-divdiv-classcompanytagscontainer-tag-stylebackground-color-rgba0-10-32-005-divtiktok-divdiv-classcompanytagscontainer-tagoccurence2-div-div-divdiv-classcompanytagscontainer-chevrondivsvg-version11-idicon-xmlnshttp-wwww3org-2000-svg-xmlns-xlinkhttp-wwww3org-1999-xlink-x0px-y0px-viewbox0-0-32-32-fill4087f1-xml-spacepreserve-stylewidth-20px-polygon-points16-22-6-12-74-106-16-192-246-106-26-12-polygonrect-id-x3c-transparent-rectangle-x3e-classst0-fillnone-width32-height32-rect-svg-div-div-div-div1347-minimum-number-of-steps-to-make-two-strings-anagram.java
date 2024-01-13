class Solution {
    public int minSteps(String s, String t) {

        if(s.length() != t.length())
            return 0;
        HashMap<Character,Integer>map=new HashMap<>();

        for(char c:s.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);

        int ans=0;
        for(char c:t.toCharArray()){
            if(map.containsKey(c) && map.get(c) > 0){
                map.put(c,map.get(c)-1);
            }else{
                ans++;
            }
        }

        return ans;
    }
}