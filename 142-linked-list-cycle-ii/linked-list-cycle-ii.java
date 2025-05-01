/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode temp = head;
        if (head == null) {
            return null;
        }
        List<ListNode> arr = new ArrayList<>();
        while (temp != null) {
            if (arr.contains(temp)) {
                return temp;
            }
            arr.add(temp);
            temp = temp.next;
        }
        return null;
    }
}
