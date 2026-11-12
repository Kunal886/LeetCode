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
    public void reorderList(ListNode head) {
          ListNode slow=head;
        ListNode fast=head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2=slow.next;
        slow.next=null;
        head2=reverseList(head2);

        ListNode ans=new ListNode(-1);
        ListNode temp=ans;
        while(head!=null && head2!=null){
            ans.next=head;
            head=head.next;
            ans=ans.next;
            ans.next=head2;
            head2=head2.next;
            ans=ans.next;
        }
        if(head!=null) ans.next=head;
        else ans.next=head2;

        

    }
    public static ListNode reverseList(ListNode head){
       if(head==null || head.next==null) return head;
       ListNode a=head.next;
       head.next=null;
       ListNode b=reverseList(a);
       a.next=head;
       return b;

    } 
    
}