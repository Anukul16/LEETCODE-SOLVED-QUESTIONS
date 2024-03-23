
public class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        // Step 1: Find the middle of the list
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the list
        ListNode prev = null, next = null;
        while (slow != null) {
            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        // Step 3: Merge the two halves
        ListNode firstHalf = head;
        ListNode secondHalf = prev; // prev now points to the head of the reversed second half
        while (secondHalf.next != null) {
            next = firstHalf.next;
            prev = secondHalf.next;
            
            firstHalf.next = secondHalf;
            secondHalf.next = next;
            
            firstHalf = next;
            secondHalf = prev;
        }
    }
}