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
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) 
    {
        ListNode temp=head;
        while(temp.next!=null)
        {
            int gcd=findgcd(temp.val,temp.next.val);
            ListNode dummy=new ListNode(gcd);
            ListNode temp1=temp.next;
            temp.next=dummy;
            dummy.next=temp1;
            temp=temp1;
        }    
        return head;
    }
    public int findgcd(int a, int b)
    {
        int i;
        if (a < b)
            i = a;
        else
            i = b;
        for (i = i; i > 1; i--) {
            if (a % i == 0 && b % i == 0)
                return i;
        }
        return 1;
    }
}