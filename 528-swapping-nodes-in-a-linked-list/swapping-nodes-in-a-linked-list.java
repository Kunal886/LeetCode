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
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        temp=head;
        int a=size-k;
        ListNode temp2=head;
        while(k!=1){
            temp=temp.next;
            k--;
        }
        while(a!=0){
            temp2=temp2.next;
            a--;
        }
        int temp3=temp.val;
        temp.val=temp2.val;
        temp2.val=temp3;

        return head;
    }
}