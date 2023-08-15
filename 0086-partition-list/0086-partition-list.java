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
    public ListNode partition(ListNode head, int x) {
        ListNode curr=head;
        ListNode dummy1=new ListNode(-1),ptr1=dummy1;
        ListNode dummy2=new ListNode(-1),ptr2=dummy2;

        while(curr!=null){
            if(curr.val<x){
                ptr1.next=curr;
                ptr1=ptr1.next;
            }else{
                ptr2.next=curr;
                ptr2=ptr2.next;
            }
            curr=curr.next;
        }
        ptr1.next=dummy2.next;
        ptr2.next=null;
        return dummy1.next;

    }
}