class Solution {
    public int[] sortArray(int[] nums) {
        Queue<Integer>pq=new PriorityQueue<>();
        for(int x:nums)pq.offer(x);
        int idx=0;
        while(!pq.isEmpty())nums[idx++]=pq.poll();
        return nums;
    }
}
