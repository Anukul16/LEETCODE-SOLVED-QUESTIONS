import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        
        
        PriorityQueue<BigInteger> pq = new PriorityQueue<>();
        for (String str : nums) {
            pq.offer(new BigInteger(str));
            if (pq.size() > k) {
                pq.poll();
            }
        }

        return pq.poll().toString();
        
    }
}
