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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy =new ListNode(-1);
        ListNode a=dummy;
        ListNode temp1=list1;
        ListNode temp2=list2;
        

        while(temp1!=null && temp2!=null ){
            if(temp1.val<temp2.val){
                a.next=temp1;
                temp1=temp1.next;
                
            }
            else{
                a.next=temp2;
                temp2=temp2.next;      
            }
              a=a.next;
        }
        
        if(temp1!=null) a.next=temp1;
        else a.next=temp2;
        return dummy.next;
        
    }
}