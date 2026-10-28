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
        ListNode dummy=new ListNode();
        ListNode temp=dummy;
        int carry=0;
        while(l1!=null && l2!=null){
            int temp0=l1.val+l2.val+carry;
            if(temp0>9){
                temp.next=new ListNode(temp0%10);
                l1=l1.next;
                l2=l2.next;
                carry=1;
            }
            else {
                temp.next=new ListNode(temp0);
                 l1=l1.next;
                 l2=l2.next;
                 carry=0;
        
            }
          
                temp=temp.next;
        }
        while(l1!=null){
            int temp1=l1.val+carry;
              if(temp1>9){
                temp.next=new ListNode(temp1%10);
                l1=l1.next;
                carry=1;
            }
            else {
                temp.next=new ListNode(temp1);
                 l1=l1.next;
                 carry=0;
        
            }
            temp=temp.next;
            
        }
        while(l2!=null){
            int temp2=l2.val+carry;
              if(temp2>9){
                temp.next=new ListNode(temp2%10);
                l2=l2.next;
                carry=1;
            }
            else {
                temp.next=new ListNode(temp2);
                 l2=l2.next;
                 carry=0;
        
            }
            temp=temp.next;
            
        }
        if(carry>0){
            temp.next= new ListNode(1);
        }
        return dummy.next;
    }
}