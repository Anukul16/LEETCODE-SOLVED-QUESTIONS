class Solution {
    public int[] frequencySort(int[] nums) {
        int res[]=new int[nums.length];

        Map<Integer,Integer>map=new HashMap();
        for(int x:nums)map.put(x,map.getOrDefault(x,0)+1);
        List<Integer>list=new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)->map.get(a)==map.get(b)?b-a:map.get(a)-map.get(b));
        int idx=0;
        for(int x:list){
            for(int i=0;i<map.get(x);i++){
                res[idx++]=x;
            }
        }
        return res;
        
    }
}