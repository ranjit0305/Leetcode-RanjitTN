class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        // Step 1: Use temp1 and temp2 to find middle
        ListNode temp1 = head, temp2 = head;
        while (temp2 != null && temp2.next != null) {
            temp1 = temp1.next;         // slow
            temp2 = temp2.next.next;    // fast
        }

        // Step 2: Reverse second half starting from temp1
        ListNode prev = null;
        while (temp1 != null) {
            ListNode next = temp1.next;
            temp1.next = prev;
            prev = temp1;
            temp1 = next;
        }

        // Now prev is the head of the reversed second half
        temp1 = head;     // reset to head for comparison
        temp2 = prev;     // second half reversed head

        // Step 3: Compare both halves
        while (temp2 != null) {
            if (temp1.val != temp2.val) return false;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return true;
    }
}
