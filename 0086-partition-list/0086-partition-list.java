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
    public ListNode partition(ListNode head, int x) {
        List<ListNode> list1= new LinkedList<>();
        List<ListNode> list2= new LinkedList<>();
        if(head==null) return null;
        ListNode curr=head;
        while(curr!=null)
        {
            int k=curr.val;
            if(k<x) list1.add(new ListNode(k));
            if(k>=x) list2.add(new ListNode(k));
            curr=curr.next;
        }

        list1.addAll(list2);
        for(int i=0;i<list1.size()-1;i++)
        {
            list1.get(i).next=list1.get(i+1);
        }
        list1.get(list1.size()-1).next=null;

        return list1.get(0);
    }
}