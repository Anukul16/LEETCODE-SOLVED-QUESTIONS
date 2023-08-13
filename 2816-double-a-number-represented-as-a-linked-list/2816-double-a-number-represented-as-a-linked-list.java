/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode doubleIt(ListNode head) {
        head=reverse(head);
        ListNode curr=head;
        int c=0;
        ListNode dummy=new ListNode(-1),ptr=dummy;
        while(curr!=null){
            c=c+(2*curr.val);
            ptr.next=new ListNode(c%10);
            ptr=ptr.next;
            c/=10;
            curr=curr.next;
        }
        while(c>0){
            ptr.next=new ListNode(c%10);
            ptr=ptr.next;
            c/=10;
        }

        return reverse(dummy.next);
    }
    public ListNode reverse(ListNode head){
        ListNode curr=head,prev=null;
        while(curr!=null){
            ListNode forward=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
        }
        return prev;
    }
}
