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
    public int getDecimalValue(ListNode head) {
        
        int binary=0;

       ListNode dummy= head;   // use to declare new node dummy just like int here we use ListNode.

        while(dummy!=null)
        {
            binary=binary*2+dummy.val;  // If you need to conv. binary to int just traverse one by one and multiply by 2.

            dummy=dummy.next;
        }
   return binary;
    }
}