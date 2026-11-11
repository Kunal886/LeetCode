class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null ||  head.next==null) return head;
        ListNode slow=head;
        ListNode fast=head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head1=slow.next;
        slow.next=null;
        ListNode left=sortList(head);
        ListNode right=sortList(head1);

        return merge(left,right);
    }
    public static ListNode merge(ListNode left,ListNode right){
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;

        while(left!=null && right!=null){
            if(left.val<right.val){
                temp.next=left;
                left=left.next;
            }
            else{
                temp.next=right;
                right=right.next;
            }
            temp=temp.next;
        }
        if(left!=null) temp.next=left;
        else temp.next=right;

        return dummy.next;
    }
}