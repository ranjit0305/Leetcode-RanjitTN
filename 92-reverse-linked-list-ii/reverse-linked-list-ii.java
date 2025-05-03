class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }
        ListNode temp = prev.next;
        ListNode curr = temp.next;
        for (int t = 0; t < right - left; t++) {
            temp.next = curr.next;
            curr.next = prev.next;
            prev.next = curr;
            curr = temp.next;
        }

        return dummy.next;
    }
}