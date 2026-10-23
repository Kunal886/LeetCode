/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp=headA;
        ListNode temp2=headB;
        int size1=0;
        int size2=0;
        while(temp!=null){
            temp=temp.next;
            size1++;
        }
        while(temp2!=null){
            temp2=temp2.next;
            size2++;
        }
        int a=Math.abs(size1-size2);
        if(size1>size2){
            while(a>0){
                headA=headA.next;
                a--;
            }
        }
        else{
              while(a>0){
                headB=headB.next;
                a--;
            }
            
        }
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
      
    }
}