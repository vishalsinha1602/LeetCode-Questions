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
    public boolean isPalindrome(ListNode head) {

        // slow and fast pointer se middle nikalenge 
        // then uske badh wale node ko reverse kr denge
        // aur compare kr node ke data ko and then minus minus

        ListNode middle = middle(head);
        ListNode t2 = reverse(middle);
        ListNode t1 = head;

        while(t2!=null)
        {
            if(t1.val != t2.val)
            return false;

            t1=t1.next;
            t2=t2.next;
        }

        return true;
        
    }


    public ListNode middle(ListNode head)
    {
     
        ListNode fast=head;
        ListNode slow=head;

        while(fast !=null && fast.next !=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }


    public ListNode reverse(ListNode head)
    {
     
        ListNode prev = null; 
        ListNode curr = head; 
        
        while (curr != null) {
            ListNode next = curr.next; 
            curr.next = prev;          
            prev = curr;               
            curr = next;             
        }

        return prev;
    }
}