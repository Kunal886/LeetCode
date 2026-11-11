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
        ListNode temp1=head;
        ListNode temp2=head;
        int size=0;
        
        while(temp1!=null){
            temp1=temp1.next;
            size++;
        }
        int a=size-k;
        temp1=head;
        while(k-->1){
            temp1=temp1.next;
        }
     
        while(a-->0){
            temp2=temp2.next;
        }
        int temp=temp1.val;
        temp1.val=temp2.val;
        temp2.val=temp;

        return head;

    }
}