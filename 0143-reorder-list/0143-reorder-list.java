class Solution {
    public void reorderList(ListNode head) {
        // if (head == null || head.next == null) {
        //     return;
        // }

        // ArrayList<Integer> list1 = new ArrayList<>();
        // ListNode curr = head;
        
        // while (curr != null) {
        //     list1.add(curr.val);
        //     curr = curr.next;
        // }

        // ArrayList<Integer> result = new ArrayList<>();
        // int n = list1.size();

        // for (int i = 0; i < (n + 1) / 2; i++) {
        //     result.add(list1.get(i));
        //     if (i != n - 1 - i) {
        //         result.add(list1.get(n - 1 - i));
        //     }
        // }

        // curr = head;
        // for (int i = 0; i < result.size(); i++) {
        //     curr.val = result.get(i);
        //     curr = curr.next;
        // }

        
        // Here we will use optimal condition

        // First step find the middle of linked list

        ListNode slow=head;

        ListNode fast=head;

        while(slow!=null && fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        //Here slow pointer have middle of list

        // Step 2: Reverse the second half

        ListNode curr=slow;
        ListNode prev=null;
       while(curr!=null)
      {
        ListNode next= curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
      }

        // Step 3:merge the list

        ListNode first=head;
        ListNode second=prev;

        while(second.next!=null)
        {
            ListNode temp1=first.next;
            ListNode temp2=second.next;

            first.next=second;
            second.next=temp1;

            first=temp1;
            second=temp2;
        }
return;
    }

}
