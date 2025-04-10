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
    public int pairSum(ListNode head) 
    {
        int sum=0;
        ListNode temp1=head;
        List<Integer> arr= new ArrayList<Integer>();
        while(temp1!=null)
        {
            arr.add(temp1.val);
            temp1=temp1.next;
        }
        int i=0;
        int j=arr.size()-1;
        while(i<arr.size()/2 && j>=arr.size()/2)
        {
            int tempsum=arr.get(i)+arr.get(j);
            if(tempsum>sum)
            {
                sum=tempsum;
            }
            i++;
            j--;
        }
        return sum;
    }
}