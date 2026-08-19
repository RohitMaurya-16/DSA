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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ArrayList<Integer> list= new ArrayList<>();
        ListNode curr= head;

        while(curr!=null)
        {
            list.add(curr.val);
            curr=curr.next;
        }

        int n=list.size();

        ArrayList<Integer> lilo=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(i>=(left-1) && i<=(right-1))
            {
                lilo.add(list.get(i));
            } 
        }
        Collections.reverse(lilo);
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(i>=(left-1) && i<=(right-1))
            {
                list.set(i,lilo.get(k));
                k++;
            } 
        }

     curr= head;

     for(int i=0;i<n;i++)
     {
        curr.val=list.get(i);
        curr=curr.next;
     }

     return head;
    }
}