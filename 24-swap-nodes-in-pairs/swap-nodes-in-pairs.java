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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy1=new ListNode(-1);
        ListNode temp1=dummy1;
        ListNode dummy2=new ListNode(-1);
        ListNode temp2=dummy2;
        ListNode temp=head;

        while(temp!=null){
            temp1.next=temp;
            temp1=temp1.next;
            temp=temp.next;
            if(temp!=null){
                temp2.next=temp;
                temp2=temp2.next;
                temp=temp.next;
            }
        }
        temp1.next=null;
        temp1=dummy1.next;
        temp2.next=null;
        temp2=dummy2.next;

        ListNode ans=new ListNode(-1);
        ListNode a=ans;

        while(temp1!=null && temp2!=null){
            a.next=temp2;
            a=a.next;
            temp2=temp2.next;

            a.next=temp1;
            a=a.next;
            temp1=temp1.next;     
        }
        if(temp1!=null) a.next=temp1;
        else a.next=temp2;

        return ans.next;
        
    }
}