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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int i=0;
        
        ListNode node=head;
        
        while(node!=null)
        {
            i++;
            if(n==1 && node.next!=null)
            {
                if(node.next.next==null)
                {
                node.next=null;
                return head;
                }
            }
            node=node.next;
        }
        
        if(n==i)
        {
            head=head.next;
            return head;
        }
        
        ListNode prev1=null;
        ListNode prev2=head;
        node = head.next;
        
        i=i-n;
        
        while(i!=1)
        {
            i--;
            prev1=prev2;
            prev2=node;
            node=node.next;
        }
        if(prev2!=head)
        {
            node.val=prev2.val;
            prev1.next=node;
        }
        else
        {
            node.val=prev2.val;
            head=head.next;
        }
        
        return head;
    }
}