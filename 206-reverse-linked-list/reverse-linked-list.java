
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode forw=null;
        ListNode prev=null;

        while(curr!=null){
            forw=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forw;
        }
        return prev;
    }
}