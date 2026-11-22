
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode slow=head;
        int size=0;
        while(slow!=null){
            slow=slow.next;
            size++;
        }
        slow=head;
       k=k%size;
       if(k==size || k==0) return head;
       ListNode fast=head;
       
       while(k-->0){
         fast=fast.next;
       } 
       while(fast.next!=null){
        slow=slow.next;
        fast=fast.next;
       }
       ListNode ans=slow.next;
       slow.next=null;
       fast.next=head;
       return ans;

    }
}