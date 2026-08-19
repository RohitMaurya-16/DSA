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
    public ListNode swapPairs(ListNode head) {
        // if(head==null) return null;
        // if(head.next==null) return head;

        //  ListNode curr=head;
        //  int prev=0;
        //  while(curr!=null && curr.next!=null)
        //  {
        //     prev=curr.val;
        //     curr.val=curr.next.val;
        //     curr.next.val=prev;
        //     curr=curr.next.next;
        //  }

        //  return head;

        // Above code will give you: Line 21: You are not allowed to modify node values (curr.val = curr.next.val)

        if(head==null && head==null) return head;

        ListNode dummy= new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        ListNode curr=head;

        while(curr!=null && curr.next!=null)
        {
            ListNode first=curr;
            ListNode second=curr.next;

            prev.next=second;
            first.next=second.next;
            second.next=first;

            prev=first;
            curr=first.next;
        }

        return dummy.next;
    }
}