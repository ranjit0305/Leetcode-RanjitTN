class Solution {
    public ListNode oddEvenList(ListNode head) {
        // Edge case: if the list is empty or has only one node, return head
        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head;          // Start with the first node (odd)
        ListNode even = head.next;    // Start with the second node (even)
        ListNode evenHead = even;     // Save the head of the even list

        while (even != null && even.next != null) {
            odd.next = even.next;     // Connect current odd node to the next odd node
            odd = odd.next;           // Move odd pointer forward
            even.next = odd.next;     // Connect current even node to the next even node
            even = even.next;         // Move even pointer forward
        }

        odd.next = evenHead; // Connect the end of the odd list to the head of the even list

        return head;
    }
}