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

import java.math.BigInteger; // needed for large number support

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        StringBuilder n1 = new StringBuilder();
        StringBuilder n2 = new StringBuilder();
        while (l1 != null) {
            n1.append(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            n2.append(l2.val);
            l2 = l2.next;
        }
        n1 = n1.reverse();
        n2 = n2.reverse();
        // Use BigInteger to handle very large numbers
        BigInteger num1 = new BigInteger(n1.toString());
        BigInteger num2 = new BigInteger(n2.toString());
        BigInteger sum = num1.add(num2);
        // Build the result linked list from the sum, in reverse order
        String s = new StringBuilder(sum.toString()).reverse().toString();
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        for (int i = 0; i < s.length(); i++) {
            temp.next = new ListNode(s.charAt(i) - '0');
            temp = temp.next;
        }
        return dummy.next;
    }
}
