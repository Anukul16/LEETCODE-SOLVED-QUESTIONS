class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode curr=dummy;
        int pSum=0;
        Map<Integer,ListNode>map=new HashMap<>();
        while(curr!=null){
            pSum+=curr.val;
            if(map.containsKey(pSum)){
                map.get(pSum).next=curr.next;
                map.clear();
                pSum=0;
                curr=dummy;
            }else{
                map.put(pSum,curr);
                curr=curr.next;
            }
        }
        return dummy.next;
    }
}