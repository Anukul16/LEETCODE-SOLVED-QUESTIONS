class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        
        int n = matches.length;
        
        TreeMap<Integer,Integer>map=new TreeMap<>();

        for(int i=0;i<n;i++){
            if(!map.containsKey(matches[i][0])){
                map.put(matches[i][0],0);
            }
            map.put(matches[i][1],map.getOrDefault(matches[i][1],0)+1);
        }
        // System.out.println(map);
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>zeroLoss=new ArrayList<>();
        List<Integer>oneLoss=new ArrayList<>();
        for(int it : map.keySet()){
            if(map.get(it)==0)
                zeroLoss.add(it);
            if(map.get(it)==1)
                oneLoss.add(it);
        }
        ans.add(zeroLoss);
        ans.add(oneLoss);
        return ans;

    }
}