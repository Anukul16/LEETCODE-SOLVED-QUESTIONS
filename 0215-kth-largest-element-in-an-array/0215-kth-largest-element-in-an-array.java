class Solution {
    public int findKthLargest(int[] nums, int k) {
        // we can do it also through the reverseorder of the comparator 
        Queue<Integer>pq=new PriorityQueue<>((a,b)->(b-a));
        for(int num:nums)pq.offer(num);
        for(int i=0;i<k-1;i++){
            pq.poll();
        }
    
        return pq.poll();
    }
}
// PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)->(a-b));
//         for (int num: nums){
//             pq.add(num);
//             if (pq.size()>k)
//                 pq.poll();
//         }
        
//         return pq.poll();