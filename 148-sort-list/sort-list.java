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
    public ListNode sortList(ListNode head) 
    {
        ListNode temp=head;
        List<Integer> arr=new ArrayList<>();
        while(temp!=null)
        {
            arr.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(arr);
        temp=head;
        int i=0;
        while(temp!=null)
        {
            temp.val=arr.get(i);
            i++;
            temp=temp.next;
        }
        return head;
    }
}