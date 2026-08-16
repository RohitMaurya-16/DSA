class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Edge Cases: If one list is empty, return the other immediately
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        
        ListNode current = list1;
        while (current.next != null) {
            current = current.next;
        }
        current.next = list2; 

        
        for (ListNode i = list1; i != null; i = i.next) {
            for (ListNode j = i.next; j != null; j = j.next) {
                if (i.val > j.val) {
                    int temp = i.val;
                    i.val = j.val;
                    j.val = temp;
                }
            }
        }

        return list1;
    }
}
