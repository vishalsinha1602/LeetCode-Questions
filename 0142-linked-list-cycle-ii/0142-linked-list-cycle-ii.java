/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
     


        // process

        //first mmove the x and 2x speed when they then calulate the starting point
        //initialise any pointer with head and slow and fast 1 step untill they meet
        while(fast != null && fast.next !=null)
        {
            slow = slow.next;
            fast=fast.next.next;
          

                if(slow==fast)
                {
                slow = head;
                    while(slow != fast)
                    {
                        slow = slow.next;
                        fast = fast.next;
                    
                    } 

                return slow;
            }
            
        }



        return null;

    

    }
}