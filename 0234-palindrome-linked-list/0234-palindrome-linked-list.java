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
    public boolean isPalindrome(ListNode head) {

        ListNode slow=head;
        ListNode fast=head;

        //finding the middle of the linked list
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        
        ListNode curr=slow;
        ListNode prev=null;
       // reverse the list from the middle
        while(curr!=null){
           ListNode forward=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
        }
        ListNode temp2=prev;
        ListNode temp=head;
       
        // checking head to middle and middle to end and then return the answer
        while(temp2!=null){
            if(temp.val!=temp2.val){
                 return false;
            }
            temp=temp.next;
            temp2=temp2.next;
               
            
        }
        return true;
    }
}