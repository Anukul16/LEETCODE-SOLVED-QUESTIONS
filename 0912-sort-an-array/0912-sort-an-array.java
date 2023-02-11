class Solution {
    public int[] sortArray(int[] nums) {
        int res[]=new int[nums.length];
        Queue<Integer>pq=new PriorityQueue();
        for(int num:nums)pq.offer(num);
        for(int i=0;i<nums.length;i++){
            res[i]=pq.poll();
        }
        return res;
    }
}