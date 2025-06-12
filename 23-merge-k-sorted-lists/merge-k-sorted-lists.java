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
    public ListNode mergeKLists(ListNode[] lists) {
        int n=lists.length;
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            ListNode temp=lists[i];
            while(temp!=null)
            {
                l.add(temp.val);
                temp=temp.next;
            }
        }
        if (l.isEmpty()) return null;
        Collections.sort(l);
        ListNode head=new ListNode(l.get(0));
        ListNode temp1=head;
        for(int i=1;i<l.size();i++)
        {
            temp1.next=new ListNode(l.get(i));
            temp1=temp1.next;
        }
        return head;
    }
}