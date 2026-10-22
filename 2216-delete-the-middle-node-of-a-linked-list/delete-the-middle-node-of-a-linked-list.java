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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        ListNode dummy=new ListNode(-1,head);
        ListNode a=dummy;
         while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next; 
            a=a.next;
         }
         a.next=a.next.next;
        
        return head;

    }
}