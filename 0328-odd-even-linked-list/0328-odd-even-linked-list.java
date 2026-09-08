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
    public ListNode oddEvenList(ListNode head) {

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        int index = 1;
        ListNode temp = head;

        // Odd positions
        while (temp != null) {

            if (index % 2 != 0) {
                curr.next = new ListNode(temp.val);
                curr = curr.next;
            }

            temp = temp.next;
            index++;
        }

        // Even positions
        index = 1;
        temp = head;

        while (temp != null) {

            if (index % 2 == 0) {
                curr.next = new ListNode(temp.val);
                curr = curr.next;
            }

            temp = temp.next;
            index++;
        }

        return dummy.next;
    }
}