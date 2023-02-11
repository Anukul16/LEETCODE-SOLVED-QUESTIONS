class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        HashMap<String,Integer>map=new HashMap<>();
        for(String s:words)map.put(s,map.getOrDefault(s,0)+1);
        
       ArrayList<String>ans=new ArrayList<>(map.keySet());
       Collections.sort(ans,(a,b)->{
           int diff=map.get(b)-map.get(a);
           if(diff!=0)return diff;
           else return a.compareTo(b);
       });

    return ans.subList(0,k);
    }
}