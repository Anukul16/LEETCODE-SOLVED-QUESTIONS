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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int cnt=0;

        ListNode temp=list1;
        ListNode ans=new ListNode(-1),dummy=ans;
        while(temp!=null){
            if(cnt==a){
                while(temp!=null && cnt!=b){
                    temp=temp.next;
                    cnt++;
                }
                break;
            }
            ListNode ptr=new ListNode(temp.val);
            dummy.next=ptr;
            dummy=dummy.next;
            cnt++;
            temp=temp.next;
        }
        // dummy.next=temp.next;
        ListNode tail=list2;
        while(tail.next!=null)tail=tail.next;
        dummy.next=list2;
        tail.next=temp.next;
        return ans.next;
    }
}