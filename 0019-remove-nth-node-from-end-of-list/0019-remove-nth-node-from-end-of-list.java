class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int countNodes = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            countNodes++;
        }
        
        int idx = countNodes - n;
        if (idx == 0) 
            return head.next;

        curr = head;
        for (int i = 0; curr != null && i < idx - 1; i++) { 
            curr = curr.next;
        }
        if (curr == null || curr.next == null) 
            return head;
        curr.next = curr.next.next;
        return head;
    }
}
