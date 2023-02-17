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
        return add(l1,l2);
    }
    private ListNode add(ListNode fList,ListNode sList){
        ListNode dummy=new ListNode(0);
        ListNode ptr=dummy;
        int carry=0;
        while(fList!=null || sList!=null || carry>0 ){
            int val1=0;
            if(fList!=null)val1=fList.val;
            int val2=0;
            if(sList!=null)val2=sList.val;
            int sum=val1+val2+carry;
            int digit=sum%10;
            carry=sum/10;
            ListNode newnode=new ListNode(digit);
            ptr.next=newnode;
            ptr=ptr.next;
            
            if(fList!=null)fList=fList.next;
            if(sList!=null)sList=sList.next;
            
        }
        return dummy.next;
    }
}