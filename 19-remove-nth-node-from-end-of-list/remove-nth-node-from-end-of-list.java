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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow=head;  
       if(head==null ) return null;

        int size=0;
        while(slow!=null){
            size++;
            slow=slow.next;
        }
           if(size==n) return head.next;
        slow=head;
        size=size-n;
        while(size-->1){
            slow=slow.next;  

        }
        slow.next=slow.next.next;

        return head;
    }
}