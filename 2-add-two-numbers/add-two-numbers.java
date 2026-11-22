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
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        int carry=0;

        while(l1!=null && l2!=null){
            int temp1=l1.val+l2.val+carry;
            temp.next=new ListNode(temp1%10);
            carry=temp1/10;
            temp=temp.next;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            int tem=l1.val+carry;
            temp.next=new ListNode(tem%10);
            carry=tem/10;
            temp=temp.next;
            l1=l1.next;
        }
          while(l2!=null){
            int tempp=l2.val+carry;
            temp.next=new ListNode(tempp%10);
            carry=tempp/10;
            temp=temp.next;
            l2=l2.next;
        }
        if(carry>0) temp.next=new ListNode(carry);
        temp=temp.next;
       // temp.next=null;
        return dummy.next;
    }
}