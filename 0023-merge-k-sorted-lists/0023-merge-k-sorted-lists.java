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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode prev=null;
        for(int i=0;i<lists.length;i++){
            prev=merge_two_list(prev,lists[i]);
        }
        return prev;
    }
    private ListNode merge_two_list(ListNode list1,ListNode list2){
        ListNode ans=new ListNode(0),dummy=ans;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                dummy.next=list1;
                list1=list1.next;
            }else{
                dummy.next=list2;
                list2=list2.next;
            }
            dummy=dummy.next;
        }
        if(list1!=null)dummy.next=list1;
        if(list2!=null)dummy.next=list2;
        return ans.next;
    }
}