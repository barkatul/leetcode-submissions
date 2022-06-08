/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode slow=headA;
        ListNode fast=headB;
        
        int c1=0;
        int c2=0;
        
        while(slow!=null)
        {
            slow=slow.next;
            c1++;
        }
        while(fast!=null)
        {
            fast=fast.next;
            c2++;
        }
        slow=headA;
        fast=headB;
        int gap=0;
        
        if(c1>c2)
        {
            gap=c1-c2;
            for(int i=0;i<gap;i++)
            {
                slow=slow.next;
            }
        }
        if(c2>c1)
        {
            gap=c2-c1;
            for(int i=0;i<gap;i++)
            {
                fast=fast.next;
            }
        }
        
        while(slow!=fast)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}