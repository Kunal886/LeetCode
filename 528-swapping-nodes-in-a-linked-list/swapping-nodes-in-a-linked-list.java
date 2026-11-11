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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow=head;
        ListNode fast=head;

        int a=k;
        while(a-->0){
            slow=slow.next;
        }
        while(slow!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow=head;
         while(k-->1){
            slow=slow.next;
        }
        int temp=slow.val;
        slow.val=fast.val;
        fast.val=temp;
        return head;

    }
}