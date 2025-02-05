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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        LinkedList<Integer> arr=new LinkedList<Integer>();
        while(list1!=null && list2!=null)
        {
            if(list1.val<=list2.val)
            {
                arr.add(list1.val);
                list1=list1.next;
            }
            else
            {
                arr.add(list2.val);
                list2=list2.next;
            }
        }
        if(list1==null)
        {
            while(list2!=null)
            {
                arr.add(list2.val);
                list2=list2.next;
            }
        }
        if(list2==null)
        {
            while(list1!=null)
            {
                arr.add(list1.val);
                list1=list1.next;
            }
        }
        ListNode head =new ListNode(0);
        ListNode current=head;
        for(int val:arr)
        {
            current.next=new ListNode(val);
            current=current.next;
        }
        return head.next;
    }
}