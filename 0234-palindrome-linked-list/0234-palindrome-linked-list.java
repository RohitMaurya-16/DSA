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
    public boolean isPalindrome(ListNode head) {
        // boolean bool=true;
        int k=0;
        ListNode node=null;
        ListNode curr=head;

        while(curr!=null)
        {
            ListNode newNode = new ListNode(curr.val);
            newNode.next=node;
            node=newNode;
            curr=curr.next;
        }
          ListNode l1=head;

        while(l1!=null && node!=null)
        {
            if(l1.val!=node.val) return false;
            l1=l1.next;
            node=node.next;
        }
        return true;

    }
}