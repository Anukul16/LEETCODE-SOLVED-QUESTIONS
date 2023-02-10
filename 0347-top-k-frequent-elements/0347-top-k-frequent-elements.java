class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap();
        if(nums.length == k) return nums;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        Queue<Integer>pq=new PriorityQueue((a,b)->map.get(b)-map.get(a));

        for(int x:map.keySet())pq.offer(x);
        int res[]=new int[k];
        for(int i=0;i<k;i++){
            res[i]=pq.poll();
        }
        
        //System.out.print(pq);
        return res;
    }
}