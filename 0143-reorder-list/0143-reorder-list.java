class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ArrayList<Integer> list1 = new ArrayList<>();
        ListNode curr = head;
        
        while (curr != null) {
            list1.add(curr.val);
            curr = curr.next;
        }

        ArrayList<Integer> result = new ArrayList<>();
        int n = list1.size();

        for (int i = 0; i < (n + 1) / 2; i++) {
            result.add(list1.get(i));
            if (i != n - 1 - i) {
                result.add(list1.get(n - 1 - i));
            }
        }

        curr = head;
        for (int i = 0; i < result.size(); i++) {
            curr.val = result.get(i);
            curr = curr.next;
        }
    }
}
