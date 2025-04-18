class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            length++;
            curr = curr.next;
        }
        k = k % length;
        if (k == 0) return head;
        for (int i = 0; i < k; i++) {
            ListNode prev = null;
            ListNode temp1 = head;
            ListNode temp2 = head;
            while (temp2.next != null) {
                prev = temp1;
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            if (prev != null) {
                prev.next = null;
                temp1.next = head;
                head = temp1;
            }
        }

        return head;
    }
}
