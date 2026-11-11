class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null|| head.next==null) return head;

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
                temp=temp.next;
                temp2=temp2.next;
            }
        }
        temp2.next=null;
        temp1.next=null;

        temp1=dummy1.next;
        temp2=dummy2.next;
        
        ListNode ans=new ListNode(-1);
        ListNode tem=ans;
        while(temp1!=null && temp2!=null){
            tem.next=temp2;
            tem=tem.next;
            temp2=temp2.next;

            tem.next=temp1;
            tem=tem.next;
            temp1=temp1.next;
            
        }
        if(temp1!=null) tem.next=temp1;
        else tem.next=temp2;

        return ans.next;
    }
}