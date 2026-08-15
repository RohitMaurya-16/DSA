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
    public ListNode middleNode(ListNode head) {
        
        int count=0;
        ListNode node=head;

        while(node!=null)
        {
            count++;
            node=node.next;
        }
      int mid=count/2;

     ListNode curr=head;
     
     for(int i=0;i<mid;i++)
     {
        curr=curr.next;
     }
     return curr;
    }
}