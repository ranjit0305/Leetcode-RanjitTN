/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteMiddle(struct ListNode* head) 
{
    if (!head->next) return NULL;
    struct ListNode *fast =head->next;
    struct ListNode *slow =head;

    while(fast->next!=NULL && fast->next->next!=NULL)
    {
        slow=slow->next;
        fast=fast->next->next;
    }    
    slow->next=slow->next->next;
    return head;
    
}