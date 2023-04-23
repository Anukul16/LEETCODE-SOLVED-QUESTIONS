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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list1=reverse(l1);
        ListNode list2=reverse(l2);
        ListNode temp=new ListNode(-1),ptr=temp;
        int carry=0;
        while(list1!=null || list2!=null || carry>0){
            int val1=0;
            if(list1!=null)val1+=list1.val;
            int val2=0;
            if(list2!=null)val2+=list2.val;
            int sum=val1+val2+carry;
            int digit=sum%10;
            carry=sum/10;
            ListNode dummy=new ListNode(digit);
            ptr.next=dummy;
            ptr=ptr.next;
            if(list1!=null)list1=list1.next;
            if(list2!=null)list2=list2.next;
        }
        return reverse(temp.next);
    }
    ListNode reverse(ListNode head){
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