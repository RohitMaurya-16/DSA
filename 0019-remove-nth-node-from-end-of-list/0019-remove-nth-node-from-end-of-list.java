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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        if(head==null) return null;

        ListNode curr= head;

        while(curr!=null)
        {
            count++;
            curr=curr.next;
        }

        int c=count-n;

        if(c==0) return head.next;
        int m=0;
        ListNode current=head;
        while(m<c-1)
        {
            current=current.next;
            m++;
        }
        current.next=current.next.next;

    return head;
    }
}