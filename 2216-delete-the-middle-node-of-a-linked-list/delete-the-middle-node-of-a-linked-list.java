class Solution {
    public ListNode deleteMiddle(ListNode head) {
        // Edge case: if the list has only one node, return null
        if (head == null || head.next == null) {
            return null;
        }

        // Step 1: Find the size of the linked list
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        // Step 2: Calculate the middle index
        int mid = size / 2;

        // Step 3: Traverse to the node just before the middle node
        temp = head;
        int t = 0;
        while (t < mid - 1) {
            temp = temp.next;
            t++;
        }

        // Step 4: Delete the middle node
        temp.next = temp.next.next;

        // Return the modified list
        return head;
    }
}
