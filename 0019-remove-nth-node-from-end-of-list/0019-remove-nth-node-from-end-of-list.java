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
     

        int length = 0;
        ListNode temp = head;

        while(temp!=null)
        {
            length++;
            temp=temp.next;
        }

        if (length == n) {
            return head.next;
        }

        ListNode curr=head;
        int i=1;
        
        while(i<length-n)
        {
            curr=curr.next;
            i++;
        }

        curr.next=curr.next.next;


        return head;


        
    }
}